package Exercise4_1;

import java.time.LocalDate;

public class CertificateOfDeposit extends BankAccounts {
    private LocalDate maturityDate;
    private double interestRate;

    /**
     * @param customerName   customerName
     * @param idNumber       idNumber
     * @param currentBalance currentBalance
     * @param maturityDate   maturityDate
     * @param interestRate   interestRate
     */
    public CertificateOfDeposit(String customerName, int idNumber, double currentBalance,
                                LocalDate maturityDate, double interestRate) {

        super(customerName, idNumber, currentBalance);
        this.maturityDate = maturityDate;
        this.interestRate = interestRate;
    }
}
