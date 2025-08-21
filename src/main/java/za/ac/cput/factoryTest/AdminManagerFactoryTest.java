package za.ac.cput.factoryTest;

import org.junit.Test;
import za.ac.cput.domain.AdminManager;
import za.ac.cput.factory.AdminManagerFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertNull;

public class AdminManagerFactoryTest {


    private static AdminManager admin1 = AdminManagerFactory.createAdminManager("jay77",null,9987654321093L,27698765423L,"Lio@gmail.com","899out","sms");

    private static AdminManager admin2 = AdminManagerFactory.createAdminManager("ju77","Lizz",889864268753L,2798643567L,"King@mail.com","iu888","email");

    private static AdminManager admin3 = AdminManagerFactory.createAdminManager("QE3216","Chris",987642369965L,279387363L,"chiris.gmailcom","9864out","sms");


    @Test
    public void testCreateAdminFailure_NullFiels(){
        assertNull(admin1);
        System.out.println("admin1 NULL");

    }
    @Test
    public void testCreateAdminWithAllAttributes(){
        assertNotNull(admin2);
        System.out.println("Admin created" + admin2.toString());
    }
    @Test
    public void testCreateAdminThatFails(){
        assertNull(admin3);
        System.out.println("admin3 creation failed as expected due to invalid email.");
    }

}
