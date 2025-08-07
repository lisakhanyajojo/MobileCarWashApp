package za.ac.cput.factoryTest;

import org.junit.Test;
import za.ac.cput.domain.User;
import za.ac.cput.factory.UserFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class UserFactoryTest {


    private static User user1 = UserFactory.createUser("Alungile", null, 9698756888888L, 27876543218L, "ron@gmail.com", "uytre33", "sms");


    private static User user2 = UserFactory.createUser("Nick", "Jemies", 9965836293745L, 2796673838L, "nick@gmail.com", "u8ujjgg", "email");

  
    private static User user3 = UserFactory.createUser("James", "Hall", 9765329187327L, 27696754321L, "jamesgmail.com", "uy777", "sms");

    @Test
    public void testCreateUserFailure_NullFields() {
        assertNull(user1);
        System.out.println("user1 creation failed as expected due to null surname.");
    }

    @Test
    public void testCreateUserWithAllAttributes() {
        assertNotNull(user2);
        System.out.println("User2 created: " + user2.toString());
    }

    @Test
    public void testCreateUserFailure_InvalidEmail() {
        assertNull(user3);
        System.out.println("user3 creation failed as expected due to invalid email.");
    }
}
