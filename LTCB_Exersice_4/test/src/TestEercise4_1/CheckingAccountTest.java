package TestEercise4_1;
import Exercise4_1.*;
import org.junit.Test;


import static org.junit.Assert.*;
public class CheckingAccountTest {
    @Test
    public void test_CheckingAccount() {
        BankAccounts earl_gray = new CheckingAccount("Earl Gray", 1782, 1_250, 500);

        assertNotNull(earl_gray);
    }
}
