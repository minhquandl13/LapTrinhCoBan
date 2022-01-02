package Exercise4_1;

public class CheckingAccount extends BankAccounts {
    private double minimumBalance;

    /**
     * @param customerName   customerName
     * @param idNumber       idNumber
     * @param currentBalance currentBalance
     * @param minimumBalance minimumBalance
     */
    public CheckingAccount(String customerName, int idNumber, double currentBalance,
                           double minimumBalance) {

        super(customerName, idNumber, currentBalance);
        this.minimumBalance = minimumBalance;
    }
}
