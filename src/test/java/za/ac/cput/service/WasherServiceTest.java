package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Washer;
import za.ac.cput.factory.WasherFactory;

import static org.junit.jupiter.api.Assertions.*;

class WasherServiceTest {

    private static IWasherService service = WasherService.getService();
    private Washer washer = WasherFactory.createWasher("W123","Lizo","Mabena","0737163991",true,5);

    @Test
    void create() {
        Washer created = service.create(washer);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void read() {
        Washer read = service.read(washer.getWasherId());
        assertNotNull(read);
        System.out.println(read);

    }

    @Test
    void update() {
        Washer newWasher = new Washer.Builder().copy(washer).setFirstName("Lizo").setLastName("Mabena").setCellPhone("27698765423").build();

        Washer updated = service.update(newWasher);
        assertNotNull(service.update(updated));
        System.out.println(updated);
    }

    @Test
    void getAll() {
        System.out.println(service.getAll());
    }
}