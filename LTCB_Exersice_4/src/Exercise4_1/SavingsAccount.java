package Exercise4_1;

public class SavingsAccount extends BankAccounts {
    private double interestRate;

    /**
     * @param customerName   customerName
     * @param idNumber       idNumber
     * @param currentBalance currentBalance
     * @param interestRate   interestRate
     */
    public SavingsAccount(String customerName, int idNumber, double currentBalance,
                          double interestRate) {
        super(customerName, idNumber, currentBalance);
        this.interestRate = interestRate;
    }

}
