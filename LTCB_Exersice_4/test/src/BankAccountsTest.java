import Exercise4_1.*;
import org.junit.Before;
import org.junit.Test;

public class BankAccountsTest {
    private MaturityDate maturityDate;

    private CheckingAccount checkingAccount;
    private SavingsAccount savingsAccount;
    private CertificateOfDeposit certificateOfDeposit;

    private Account account1;
    private Account account2;
    private Account account3;

    private BankAccounts bankAccounts1;
    private BankAccounts bankAccounts2;
    private BankAccounts bankAccounts3;


    @Before
    public void setUpTestcase() {

        maturityDate = new MaturityDate(1, "June", 2005);

        checkingAccount = new CheckingAccount(500.0);
        certificateOfDeposit = new CertificateOfDeposit(maturityDate, 0.04);
        savingsAccount = new SavingsAccount(0.035);


        account1 = new Account(checkingAccount, savingsAccount, certificateOfDeposit);


        bankAccounts1 = new BankAccounts("Earl Gray", 1729, 1_250, account1);
        bankAccounts2 = new BankAccounts("Ima Flatt", 4104, 10_123, account2);
        bankAccounts3 = new BankAccounts("Annie Proulx", 2992, 800, account3);
    }

    @Test
    public void test_BankAccounts() {
        System.out.println(bankAccounts3);
    }
}
