package TestExercise2_1;

import Baitap2_1.Employee;
import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
    // Bài tập 2.1
    public void test_employee() {
        Employee aEmployeeA = new Employee("Mai", 30);
        Employee aEmployeeB = new Employee("Minh", 102);
        Employee aEmployeeC = new Employee("Nam", 20);
    }

    public void test_wage() {
        Employee aEmployeeA = new Employee("Mai", 30);
        Employee aEmployeeB = new Employee("Minh", 102);
        Employee aEmployeeC = new Employee("Nam", 20);

        assertEquals(aEmployeeA.WageOfEmployee(), 360);
        assertEquals(aEmployeeB.WageOfEmployee(), 1224);
        assertEquals(aEmployeeC.WageOfEmployee(), 240);
    }

    public void test_tax() {
        Employee aEmployeeA = new Employee("Mai", 30);
        Employee aEmployeeB = new Employee("Minh", 102);
        Employee aEmployeeC = new Employee("Nam", 40);

        assertEquals(aEmployeeA.TaxOfEmployee(), 54.0, 0.001);
        assertEquals(aEmployeeB.TaxOfEmployee(), 183.6, 0.001);
        assertEquals(aEmployeeC.TaxOfEmployee(), 72.0, 0.001);
    }

    public void test_netPay() {
        Employee aEmployeeA = new Employee("Mai", 30);
        Employee aEmployeeB = new Employee("Minh", 102);
        Employee aEmployeeC = new Employee("Nam", 40);

        assertEquals(aEmployeeA.NetPayOfEmployee(), 306.0, 0.01);
        assertEquals(aEmployeeB.NetPayOfEmployee(), 1040.4, 0.01);
        assertEquals(aEmployeeC.NetPayOfEmployee(), 408.0, 0.001);
    }

    public void raiseWageTest() {
        Employee aEmployeeA = new Employee("Mai", 30);
        Employee aEmployeeB = new Employee("Minh", 102);
        Employee aEmployeeC = new Employee("Nam", 20);

        assertEquals(aEmployeeA.RaisedWageOfEmployee(), 374.0, 0.001);
        assertEquals(aEmployeeB.RaisedWageOfEmployee(), 1238.0, 0.001);
        assertEquals(aEmployeeC.RaisedWageOfEmployee(), 254, 0.001);
    }

    public void test_checkOverTime() {


        Employee aEmployeeA = new Employee("Mai", 30);

        Employee aEmployeeB = new Employee("Minh", 102);
        Employee aEmployeeC = new Employee("Nam", 20);

        assertFalse(aEmployeeA.CheckOverTimeOfEmployee());
        assertTrue(aEmployeeB.CheckOverTimeOfEmployee());
        assertFalse(aEmployeeC.CheckOverTimeOfEmployee());
    }

    // Bài tập 2.1.1
    public void test_taxWithRate() {
        Employee aEmployeeA = new Employee("Mai", 30);
        Employee aEmployeeB = new Employee("Minh", 102);
        Employee aEmployeeC = new Employee("Nam", 20);

        assertEquals(aEmployeeA.TaxWithRate(), 54.0, 0.001);
        assertEquals(aEmployeeB.TaxWithRate(), 342.72, 0.001);
        assertEquals(aEmployeeC.TaxWithRate(), 0.0, 0.001);
    }

    public void test_netPayWithRate() {
        Employee aEmployeeA = new Employee("Mai", 30);
        Employee aEmployeeB = new Employee("Minh", 102);
        Employee aEmployeeC = new Employee("Nam", 20);

        assertEquals(306.0, aEmployeeA.NetPayWithRate(), 0.001);
        assertEquals(881.28, aEmployeeB.NetPayWithRate(), 0.001);
        assertEquals(240.0, aEmployeeC.NetPayWithRate(), 0.001);
    }
}
