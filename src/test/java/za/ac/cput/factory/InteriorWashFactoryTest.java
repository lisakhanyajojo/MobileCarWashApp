package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.InteriorWash;

import static org.junit.jupiter.api.Assertions.*;

class InteriorWashFactoryTest {
    InteriorWash interiorWash = InteriorWashFactory.createInteriorWash("3r3", "Interior Wash",
            "Wash only the outside of the vehicle", 75 , 45, "Yes", 35);
    @Test
    void createInteriorWash() {
        assertNotNull(interiorWash);
    }
}