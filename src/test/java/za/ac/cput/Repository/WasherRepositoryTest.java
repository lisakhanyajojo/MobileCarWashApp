package za.ac.cput.Repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Washer;
import za.ac.cput.factory.WasherFactory;
import za.ac.cput.util.Helper;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class WasherRepositoryTest {

    private static IWasherRepository repository = WasherRepository.getRepository();

    private Washer washer = WasherFactory.createWasher(
            "Lisa",
            "John",
            "Doe",
            "0737163991",
            false,
            5
    );

    @Test
    void create() {
        Washer created = repository.create(washer);
        assertNotNull(created);
        assertEquals(washer.getWasherId(), created.getWasherId());
        System.out.println("Created: " + created);

    }

    @Test
    void read() {
        repository.create(washer);
        Washer read = repository.read(washer.getWasherId());
        assertNotNull(read);
        System.out.println("Read: " + read);

    }

    @Test
    void update() {
        repository.create(washer);
        Washer updatedWasher = new Washer.Builder()
                .copy(washer)
                .setFirstName("Jane")
                .setLastName("Smith")
                .build();

    }


    @Test
    void delete() {
        repository.create(washer);
        assertTrue(repository.delete(washer.getWasherId()));
        System.out.println("Deleted: " + washer.getWasherId());
    }

    @Test
    void getAll() {
        System.out.println("Get All: ");
        System.out.println(repository.getAll());

    }
}