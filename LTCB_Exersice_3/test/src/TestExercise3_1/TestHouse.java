package TestExercise3_1;

import Baitap3_1.Address;
import Baitap3_1.House;
import junit.framework.TestCase;

public class TestHouse extends TestCase {

    private Address address1 = new Address(23, "Maple Street", "Brookline");
    private Address address2 = new Address(5, "Joye Road", "Newton");
    private Address address3 = new Address(83, "Winslow Road", "Waltham");
    public void test_House() {
        House houseA = new House("Ranch", 7, 375.000, address1);
        House houseB = new House("Colonial", 9, 450.000, address2);
        House houseC = new House("Cape", 6, 235.000, address3);

        assertNotNull(houseA);
        assertNotNull(houseB);
        assertNotNull(houseC);
    }

    public void test_HasMoreRoom() {
        House houseA = new House("Ranch", 7, 375.000, address1);
        House houseB = new House("Colonial", 9, 450.000, address2);
        House houseC = new House("Cape", 6, 235.000, address3);

        assertFalse(houseA.hasMoreRoom(houseB));
        assertTrue(houseB.hasMoreRoom(houseC));
    }

    public void test_InThisCity() {
        House houseA = new House("Ranch", 7, 375.000, address1);
        House houseB = new House("Colonial", 9, 450.000, address2);
        House houseC = new House("Cape", 6, 235.000, address3);

        assertTrue(houseA.inThisCity("Brookline"));
        assertFalse(houseA.inThisCity("Newton"));
    }

    public void test_SameCity() {
        House houseA = new House("Ranch", 7, 375.000, address1);
        House houseB = new House("Colonial", 9, 450.000, address2);
        House houseC = new House("Cape", 6, 235.000, address3);

        assertTrue(houseA.sameCity(houseA));
        assertFalse(houseB.sameCity(houseC));
    }
}