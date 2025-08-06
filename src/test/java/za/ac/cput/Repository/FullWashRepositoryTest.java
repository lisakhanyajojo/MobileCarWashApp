package za.ac.cput.Repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.FullWash;
import za.ac.cput.factory.FullWashFactory;

import static org.junit.jupiter.api.Assertions.*;

class FullWashRepositoryTest {
private static IFullWashRepository repository = FullWashRepository.createRepository();
    public FullWash fullWash = FullWashFactory.createFullWash("896DF" , "Full Wash","Wash the whole car inside and outside" , 125
            , 3, 30, true);
    @Test
    void create() {
        assertNotNull(repository.create(fullWash));
        System.out.println(fullWash);
    }

    @Test
    void read() {
        FullWash fw = repository.read(fullWash.getServiceId());
        assertNotNull(fw);
        System.out.println(fullWash);
    }


    @Test
    void update() {
        FullWash newFullWash = new FullWash.Builder().copy(fullWash).setDuration(1).build();

         assertNotNull( repository.update(newFullWash));
        System.out.println(fullWash);

    }

    @Test
    void delete() {
        assertTrue(repository.delete(fullWash.getServiceId()));
        System.out.println("Success in deletion");
    }

    @Test
    void getAll() {
      System.out.println(repository.getAll());
    }
}