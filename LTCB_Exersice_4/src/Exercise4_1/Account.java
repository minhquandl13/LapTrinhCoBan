package Exercise4_1;

public class Account {
    private CheckingAccount checkingAccont;
    private SavingsAccount savingsAccount;
    private CertificateOfDeposit certificateOfDeposit;

    public Account(CheckingAccount checkingAccont, SavingsAccount savingsAccount, CertificateOfDeposit certificateOfDeposit) {
        this.checkingAccont = checkingAccont;
        this.savingsAccount = savingsAccount;
        this.certificateOfDeposit = certificateOfDeposit;
    }
}
