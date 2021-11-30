package Exercise4_1;

public class BankAccounts {
    private String customerName;
    private int idNumber;
    private double totalMoney;
    private Account account;


    public BankAccounts(String customerName, int idNumber ,double totalMoney, Account account) {
        this.idNumber = idNumber;
        this.customerName = customerName;
        this.account = account;
        this.totalMoney = totalMoney;
    }
}
