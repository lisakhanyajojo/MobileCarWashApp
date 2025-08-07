package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.FullWash;

import static org.junit.jupiter.api.Assertions.*;
class FullWashFactoryTest {
FullWash fullWash = FullWashFactory.createFullWash("896DF" , "Full Wash","Wash the whole car insde and outside" , 125
, 3, 30, true);
    @Test
    void createFullWash() {
        assertNotNull(fullWash);
        System.out.println(fullWash);
    }
}