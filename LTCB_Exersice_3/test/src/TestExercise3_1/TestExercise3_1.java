package TestExercise3_1;

import Baitap3_1.Address;
import Baitap3_1.House;
import junit.framework.TestCase;

public class TestExercise3_1 extends TestCase {

    public void test_House() {
        Address address1 = new Address(23, "Maple Street", "Brookline");
        Address address2 = new Address(5, "Joye Road", "Newton");
        Address address3 = new Address(83, "Winslow Road", "Waltham");
        House houseA = new House("Ranch", 7, 375.000, address1);
        House houseB = new House("Colonial", 9, 450.000, address2);
        House houseC = new House("Cape", 6, 235.000, address3);
    }

    public void test_HasMoreRoom() {
        Address address1 = new Address(23, "Maple Street", "Brookline");
        Address address2 = new Address(5, "Joye Road", "Newton");
        Address address3 = new Address(83, "Winslow Road", "Waltham");
        House houseA = new House("Ranch", 7, 375.000, address1);
        House houseB = new House("Colonial", 9, 450.000, address2);
        House houseC = new House("Cape", 6, 235.000, address3);

        assertFalse(houseA.hasMoreRoom(houseB));
        assertTrue(houseB.hasMoreRoom(houseC));
    }

    public void test_InThatHouse() {
        Address address1 = new Address(23, "Maple Street", "Brookline");
        Address address2 = new Address(5, "Joye Road", "Newton");
        Address address3 = new Address(83, "Winslow Road", "Waltham");
        House houseA = new House("Ranch", 7, 375.000, address1);
        House houseB = new House("Colonial", 9, 450.000, address2);
        House houseC = new House("Cape", 6, 235.000, address3);

        assertTrue(houseA.inThisCity("Brookline"));
        assertFalse(houseA.inThisCity("Newton"));
    }

    public void test_SameCity() {
        Address address1 = new Address(23, "Maple Street", "Brookline");
        Address address2 = new Address(5, "Joye Road", "Newton");
        Address address3 = new Address(83, "Winslow Road", "Waltham");
        House houseA = new House("Ranch", 7, 375.000, address1);
        House houseB = new House("Colonial", 9, 450.000, address2);
        House houseC = new House("Cape", 6, 235.000, address3);

        assertTrue(houseA.sameCity("Brookline"));
        assertFalse(houseB.sameCity("Ho Chi Minh"));
    }
}