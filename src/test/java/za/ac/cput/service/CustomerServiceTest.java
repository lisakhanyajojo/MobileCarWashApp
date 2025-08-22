package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = za.ac.cput.Main.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerServiceTest {

    @Autowired
    private ICustomerService service;

    private Address address = new Address.Builder()
            .setStreetNumber("12")
            .setStreetName("Dorset St")
            .setCity("Cape Town")
            .setPostalCode("8000")
            .setSuburb("WC")
            .build();

    private Customer customer = CustomerFactory.createCustomer(
            "Anele", "Jaji", "Toyota Corolla", 2,
            false, true, "FNB", 12345678,
            9701011234567L, 821234567,
            "Anele@gmail.com", "SMS", "password", address
    );

    @Test
    void a_create() {
        Customer saved = service.create(customer);
        assertNotNull(saved);
        customer = saved; // ✅ update with generated UUID
        System.out.println(saved);
    }

    @Test
    void b_read() {
        Customer read = service.read(customer.getUserId());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void c_update() {
        Customer updated = service.update(
                new Customer.Builder().copy(customer).setFirstName("Qondeezy").build()
        );
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void d_getAll() {
        System.out.println(service.getAll());
    }
}
