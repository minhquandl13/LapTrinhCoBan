package TestExercise3_1;

import Baitap3_1.Address;
import Baitap3_1.House;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestHouse {

    private Address address1;
    private Address address2;
    private Address address3;

    private House houseA;
    private House houseB;
    private House houseC;

    @Before
    public void setUpTestcase(){
        address1 = new Address(23, "Maple Street", "Brookline");
        address2 = new Address(5, "Joye Road", "Newton");
        address3 = new Address(83, "Winslow Road", "Waltham");

        houseA = new House("Ranch", 7, 375.000, address1);
        houseB = new House("Colonial", 9, 450.000, address2);
        houseC = new House("Cape", 6, 235.000, address3);
    }

    @Test
    public void test_House() {
        assertNotNull(houseA);
        assertNotNull(houseB);
        assertNotNull(houseC);
    }

    @Test
    public void test_HasMoreRoom() {
        assertFalse(houseA.hasMoreRoom(houseB));
        assertTrue(houseB.hasMoreRoom(houseC));
    }

    @Test
    public void test_InThisCity() {
        assertTrue(houseA.inThisCity("Brookline"));
        assertFalse(houseA.inThisCity("Newton"));
    }

    public void test_SameCity() {
        assertTrue(houseA.sameCity(houseA));
        assertFalse(houseB.sameCity(houseC));
    }
}