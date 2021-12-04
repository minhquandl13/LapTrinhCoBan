package TestEercise4_1;
import Exercise4_1.*;
import org.junit.Test;


import static org.junit.Assert.*;
public class SavingAccountTest {

    @Test
    public void test_SavingAccount() {
        BankAccounts annie_proulx = new SavingsAccount("Annie Proulx", 2992, 800, 3.5);

        assertNotNull(annie_proulx);
    }
}
