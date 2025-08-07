package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.FullWash;
import za.ac.cput.domain.InteriorWash;
import za.ac.cput.factory.InteriorWashFactory;

import static org.junit.jupiter.api.Assertions.*;

class InteriorServiceTest {
     IInteriorWashService service = InteriorService.createServiceRepo();
    InteriorWash interiorWash = InteriorWashFactory.createInteriorWash("3r3", "Interior Wash",
            "Wash only the outside of the vehicle", 75 , 45, "Yes", 35);
    @Test
    void create() {
        InteriorWash  newInteriorWash = service.create(interiorWash);
        assertNotNull(newInteriorWash);
        System.out.println(newInteriorWash);
    }

    @Test
    void read() {
        InteriorWash newInteriorWash = service.read(interiorWash.getServiceId());
        assertNotNull(newInteriorWash);
        System.out.println(newInteriorWash);
    }

    @Test
    void update() {
        InteriorWash newInteriorWash = new InteriorWash.Builder().copy(interiorWash).setDuration(20).build();

        InteriorWash updatedInteriorWash = service.update(newInteriorWash);
        assertNotNull(updatedInteriorWash);
        System.out.println(updatedInteriorWash);
    }

    @Test
    void getAllInteriorList() {
       System.out.println(service.getAllInteriorList());
    }
}