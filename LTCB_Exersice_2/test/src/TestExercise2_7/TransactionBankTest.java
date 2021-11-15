package TestExercise2_7;

import Baitap2_7.TransactionBank;
import junit.framework.TestCase;

public class TransactionBankTest extends TestCase {
    public void test_TransactionBank() {
        TransactionBank transactionBank1 = new TransactionBank("Thuy", 6000, 2);
        TransactionBank transactionBank2 = new TransactionBank("Mai", 2500, 1);
        TransactionBank transactionBank3 = new TransactionBank("Nam", 1500, 2);
    }

    // Exercise 2.7.1
    public void test_Interest() {
        TransactionBank transactionBank1 = new TransactionBank("Thuy", 6000, 2);
        TransactionBank transactionBank2 = new TransactionBank("Mai", 2500, 1);
        TransactionBank transactionBank3 = new TransactionBank("Nam", 1500, 2);

        assertEquals(300.0, transactionBank1.interest(), 0.001);
        assertEquals(112.5, transactionBank2.interest(), 0.001);
        assertEquals(67.5, transactionBank3.interest(), 0.001);
    }

    // Exercise 2.7.2
    public void test_Payback() {
        TransactionBank transactionBank1 = new TransactionBank("Thuy", 6000, 2);
        TransactionBank transactionBank2 = new TransactionBank("Mai", 2500, 1);
        TransactionBank transactionBank3 = new TransactionBank("Nam", 1500, 2);

        assertEquals(48.75, transactionBank1.payback(), 0.001);
        assertEquals(13.75, transactionBank2.payback(), 0.001);
        assertEquals(6.25, transactionBank3.payback(), 0.001);
    }
}
