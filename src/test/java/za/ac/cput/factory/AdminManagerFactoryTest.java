package za.ac.cput.factory;


import za.ac.cput.domain.AdminManager;
import za.ac.cput.factory.AdminManagerFactory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdminManagerFactoryTest {

    private static AdminManager admin1 = AdminManagerFactory.createAdminManager("Alunge3234","jay", null, 9987654321093L, 27698765423L, "Lio@gmail.com", "899out", "sms");

    private static AdminManager admin2 = AdminManagerFactory.createAdminManager("Jojo65456","ju77", "Lizz",  889864268753L, 2798643567L, "King@mail.com", "iu888", "email");

    private static AdminManager admin3 = AdminManagerFactory.createAdminManager("Ace567","QE3216", "Chris",  987642369965L, 2L, "chiris.gmailcom", "9864out", "sms");

    @Test
    public void testCreateAdminFailure_NullFields() {
        assertNull(admin1);
        System.out.println("admin1 creation failed due to null first name.");
    }

    @Test
    public void testCreateAdminWithAllAttributes() {
        assertNotNull(admin2);
        System.out.println("Admin created successfully: " + admin2.toString());
    }

    @Test
    public void testCreateAdminThatFails() {
        assertNull(admin3);
        System.out.println("admin3 creation failed due to invalid email.");
    }
}
