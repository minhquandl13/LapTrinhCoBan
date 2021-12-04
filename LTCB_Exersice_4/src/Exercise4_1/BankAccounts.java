package Exercise4_1;

public class BankAccounts {
    private String customerName;
    private int idNumber;
    private double currentBalance;


    public BankAccounts(String customerName, int idNumber ,double currentBalance) {
        this.idNumber = idNumber;
        this.customerName = customerName;
        this.currentBalance = currentBalance;
    }
}
