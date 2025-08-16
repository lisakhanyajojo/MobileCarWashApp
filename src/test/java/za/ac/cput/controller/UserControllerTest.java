package za.ac.cput.controller;


import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.AdminManager;
import za.ac.cput.domain.User;
import za.ac.cput.factory.UserFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.MethodName.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserControllerTest {

    private static User user;
    @Autowired
    private TestRestTemplate restTemplate;
    private static final String BASE_URL = "http://localhost:3306/mobilecarwashapp/user";

    @BeforeAll
    public static void setup(){
        user = UserFactory.createUser("Nick", "Jemies", 9965836293745L, 2796673838L, "nick@gmail.com", "u8ujjgg", "email");
    }
    @Test
    public void a_create(){
        String url = BASE_URL + "/create";
        ResponseEntity<User> postResponse = this.restTemplate.postForEntity(url , user,User.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        User userSaved = postResponse.getBody();
        assertEquals(user.getFirstName(), userSaved.getFirstName());
        System.out.println("Created: " + userSaved);
    }
    @Test
    public void read(){
        String url = BASE_URL + "/read" + user.getLastName();
        ResponseEntity<User> response = this.restTemplate.getForEntity(url ,User.class);
        assertEquals(user.getLastName(),response.getBody().getLastName());
        System.out.println("Read: " + response.getBody());
    }
    @Test
    public void update(){

        User updatedUser = new User.Builder().copy(user).setFirstName("Neo").build();
        String url = BASE_URL + "/update";
        ResponseEntity<User> response = this.restTemplate.postForEntity(url ,updatedUser,User.class);
        assertNotNull(response.getBody());
        assertEquals(updatedUser.getEmail(),response.getBody().getEmail());
        System.out.println("Updated: " + response.getBody());


    }
    @Test
    public void delete(){
        String url = BASE_URL + "/delete" + user.getEmail();
        this.restTemplate.delete(url);

        ResponseEntity<User> response =  this.restTemplate.getForEntity(BASE_URL + "/read" + user.getEmail(), User.class);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        System.out.println("Deleted: " + "true");
    }

    @Test
    public void getall() {
        String url = BASE_URL + "/update";
        ResponseEntity<User[]> response = this.restTemplate.getForEntity(url, User[].class);
        assertNotNull(response.getBody());
        System.out.println("get all: ");
        for (User user : response.getBody()) {
            System.out.println(user);
        }


    }
}




