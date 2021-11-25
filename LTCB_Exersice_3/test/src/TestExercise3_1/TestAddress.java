package TestExercise3_1;

import Baitap3_1.Address;
import junit.framework.TestCase;

public class TestAddress extends TestCase {

    public void test_Address() {
        Address address1 = new Address(23, "Maple Street", "Brookline");
        Address address2 = new Address(5, "Joye Road", "Newton");

        assertNotNull(address1);
        assertNotNull(address2);
    }

    public void test_InThisCity() {
        Address address1 = new Address(23, "Maple Street", "Brookline");
        Address address2 = new Address(5, "Joye Road", "Newton");

        assertTrue(address1.inThisCity("Brookline"));
        assertFalse(address2.inThisCity("Brookline"));
    }

    public void test_SameCity() {
        Address address1 = new Address(23, "Maple Street", "Brookline");
        Address address2 = new Address(5, "Joye Road", "Newton");

        assertTrue(address2.sameCity(address2));
        assertFalse(address1.sameCity(address2));
    }
}
