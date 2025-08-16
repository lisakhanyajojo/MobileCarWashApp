package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.FullWash;
import za.ac.cput.factory.FullWashFactory;

import static org.junit.jupiter.api.Assertions.*;

class FullWashServiceTest {
    IFullWashService service = FullWashService.getServiceRepo();
    public FullWash fullWash = FullWashFactory.createFullWash("896DF" , "Full Wash","Wash the whole car inside and outside" , 125
            , 3, 30, true);
    @Test
    void create() {
        FullWash fullWashTester = service.create(fullWash);
        assertNotNull(fullWashTester);
        System.out.println(fullWashTester);
    }

    @Test
    void read() {
        FullWash newFullWash = service.read(fullWash.getServiceId());
        assertNotNull(newFullWash);
        System.out.println(newFullWash);

    }

    @Test
    void update() {
        FullWash newFullWash = new FullWash.Builder().copy(fullWash).setPrice(115).build();
        FullWash updatedFullWash = service.update(newFullWash);
        assertNotNull(updatedFullWash);
        System.out.println(updatedFullWash);
    }

    @Test
    void getAll() {
        System.out.println(service.getAll());
    }
}