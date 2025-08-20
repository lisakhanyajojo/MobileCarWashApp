package za.ac.cput.controller;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.AdminManager;
import za.ac.cput.factory.AdminManagerFactory;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdminManagerControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private static final String BASE_URL = "/MobileCarWashApp/adminManagerService";
    private static AdminManager admin;

    @BeforeAll
    static void setup() {

        admin = AdminManagerFactory.createAdminManager(
                "Sasa56","litha654324","Litha",
                889864268753L, 2798643567L,
                "King@mail.com", "iu888", "email"
        );
    }

    @Test
    @Order(1)
    void a_create() {

        String url = BASE_URL + "/create"  ;
        ResponseEntity<AdminManager> postResponse = restTemplate.postForEntity(url, admin, AdminManager.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody(), "Response body should not be null");
        admin = postResponse.getBody();
        //assertEquals( postResponse.getStatusCode(), "Expected 200 OK");
        System.out.println("Created: " + admin );
    }

    @Test
    @Order(2)
    void b_read() {
        String url = BASE_URL + "/read/" ;

        ResponseEntity<AdminManager> response = restTemplate.getForEntity(url, AdminManager.class);
        //assertEquals(HttpStatus.OK, response.getStatusCode());
      assertNotNull(response.getBody());
        assertEquals(admin.getAdminManagerId(), response.getBody().getAdminManagerId());
        System.out.println("Read: " + response.getBody());
        System.out.println("Request Body: " + admin);

    }

    @Test
    @Order(3)
    void c_update() {
        AdminManager updated = new AdminManager.Builder()
                .copy(admin)
                .setFirstName("Ntombi")
                .build();

        String url = BASE_URL + "/update";
        restTemplate.put(url, updated);

        // Verify update
        String readUrl = BASE_URL + "/read/" + updated.getAdminManagerId();
        ResponseEntity<AdminManager> response = restTemplate.getForEntity(readUrl, AdminManager.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        AdminManager found = response.getBody();
        assertNotNull(found);
        assertEquals("Ntombi", found.getFirstName());

        System.out.println("Updated: " + found);
        admin = found; // update reference
    }

    @Test
    @Order(4)
    void d_findAll() {
        String url = BASE_URL + "/findAll";
        ResponseEntity<AdminManager[]> response =
                restTemplate.getForEntity(url, AdminManager[].class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());

        System.out.println("All Admins:");
        //Arrays.stream(response.getBody()).forEach(System.out::println);
    }

    @Test
    @Order(5)
    void e_delete() {
        String url = BASE_URL + "/delete/" + admin.getAdminManagerId();
        restTemplate.delete(url);

        // Try reading deleted entity
        String readUrl = BASE_URL + "/read/" + admin.getAdminManagerId();
        ResponseEntity<AdminManager> response = restTemplate.getForEntity(readUrl, AdminManager.class);

        // Expect NOT FOUND (404) or null body
        assertTrue(response.getStatusCode() == HttpStatus.NOT_FOUND
                || response.getBody() == null);

        System.out.println("Deleted: true | Status: " + response.getStatusCode());
    }
}
