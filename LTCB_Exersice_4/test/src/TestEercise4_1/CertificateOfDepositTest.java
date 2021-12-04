package TestEercise4_1;
import Exercise4_1.*;
import org.junit.Test;


import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;
public class CertificateOfDepositTest {

    @Test
    public void test_CertificateOfDeposit() {
        BankAccounts ima_flatt = new CertificateOfDeposit("Ima Flatt", 4104, 10_123,
                LocalDate.of(2005, Month.JUNE, 1), 4);

        assertNotNull(ima_flatt);
    }
}
