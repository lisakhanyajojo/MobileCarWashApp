package za.ac.cput.Repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.InteriorWash;
import za.ac.cput.factory.InteriorWashFactory;

import static org.junit.jupiter.api.Assertions.*;
class InteriorWashRepositoryTest {
    private static IInteriorWashRepository repository = InteriorWashRepository.createRepo();
    InteriorWash interiorWash = InteriorWashFactory.createInteriorWash("3r3", "Interior Wash",
            "Wash only the outside of the vehicle", 75, 45, "Yes", 35);



    @Test
    void create() {
        InteriorWash NewInteriorWash = repository.create(interiorWash);
        assertNotNull(NewInteriorWash);
        System.out.println(NewInteriorWash);
    }

    @Test
    void read() {
        InteriorWash NewInteriorWash = repository.read(interiorWash.getServiceId());
        assertNotNull(NewInteriorWash);
        System.out.println(NewInteriorWash);
    }

    @Test
    void update() {
        InteriorWash interiorWash1 = new InteriorWash.Builder().copy(interiorWash).setAirFreshenerTyp("No").build();
        assertNotNull(repository.update(interiorWash1));
        System.out.println(interiorWash1);
    }

    @Test
    void delete() {
        assertTrue(repository.delete(interiorWash.getServiceId()));


    }

    @Test
    void getAll() {
        System.out.println(repository.getAll());
    }
}