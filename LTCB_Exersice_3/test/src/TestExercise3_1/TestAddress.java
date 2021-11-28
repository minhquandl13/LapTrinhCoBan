package TestExercise3_1;

import Baitap3_1.Address;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAddress {
    private Address address1;
    private Address address2;

    @Before
    public void setUpTestcase(){
        address1 = new Address(23, "Maple Street", "Brookline");
        address2 = new Address(5, "Joye Road", "Newton");
    }

    @Test
    public void test_Address() {
        assertNotNull(address1);
        assertNotNull(address2);
    }

    @Test
    public void test_InThisCity() {
        assertTrue(address1.inThisCity("Brookline"));
        assertFalse(address2.inThisCity("Brookline"));
    }

    @Test
    public void test_SameCity() {
        assertTrue(address2.sameCity(address2));
        assertFalse(address1.sameCity(address2));
    }
}
