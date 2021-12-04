package TestEercise4_1;

import Exercise4_1.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

public class BankAccountsTest {

    @Test
    public void test_BankAccounts() {
        BankAccounts earl_gray = new CheckingAccount("Earl Gray", 1782, 1_250, 500);
        BankAccounts annie_proulx = new SavingsAccount("Annie Proulx", 2992, 800, 3.5);
        BankAccounts ima_flatt = new CertificateOfDeposit("Ima Flatt", 4104, 10_123,
                                                            LocalDate.of(2005, Month.JUNE, 1), 4);


        assertNotNull(earl_gray);
        assertNotNull(annie_proulx);
        assertNotNull(ima_flatt);
    }
}
