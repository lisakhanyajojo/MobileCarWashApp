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
                "litha654324","Litha",
                889864268753L, 2798643567L,
                "King@mail.com", "iu888", "email"
        );
    }

    @Test
    @Order(1)
    void a_create() {
        String url = BASE_URL + "/create";
        ResponseEntity<AdminManager> postResponse = restTemplate.postForEntity(url, admin, AdminManager.class);
        assertNotNull(postResponse);
        AdminManager savedAdmin = postResponse.getBody();
        assertEquals(HttpStatus.OK, postResponse.getStatusCode());
        assertEquals(200, postResponse.getStatusCodeValue());
        assertNotNull(savedAdmin);
        assertEquals(admin.getUserId(),savedAdmin.getUserId(), "AdminManager ID should not be null");
        System.out.println("Created AdminManager: " + savedAdmin);



       // String url = BASE_URL + "/create";
        //ResponseEntity<AdminManager> postResponse = this.restTemplate.postForEntity(url,admin, AdminManager.class);
        //assertNotNull(postResponse);
      //  admin = postResponse.getBody();
       //assertNotNull(admin);
        //assertNotNull(admin.getUserId(), "AdminManager ID should not be null");
       //assertEquals(HttpStatus.OK, postResponse.getStatusCode(), "Expected 200 OK");System.out.println("Created: " + admin + " | Status: " + postResponse.getStatusCode());
    }

    @Test
    @Order(2)
    void b_read() {
        String url = BASE_URL + "/read/" + admin.getUserId();


        ResponseEntity<AdminManager> response = restTemplate.getForEntity(url, AdminManager.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(admin.getUserId(), response.getBody().getUserId());

        System.out.println("Read: " + response.getBody());
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
        String readUrl = BASE_URL + "/read/" + updated.getUserId();
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
        String url = BASE_URL + "/delete/" + admin.getUserId();
        restTemplate.delete(url);

        // Try reading deleted entity
        String readUrl = BASE_URL + "/read/" + admin.getUserId();
        ResponseEntity<AdminManager> response = restTemplate.getForEntity(readUrl, AdminManager.class);

        // Expect NOT FOUND (404) or null body
        assertTrue(response.getStatusCode() == HttpStatus.NOT_FOUND
                || response.getBody() == null);

        System.out.println("Deleted: true | Status: " + response.getStatusCode());
    }
}
