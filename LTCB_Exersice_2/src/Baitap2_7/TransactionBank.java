package Baitap2_7;

public class TransactionBank {
    String customerName;
    double depositAmount;
    int maturity;

    /**
     * @param customerName
     * @param depositAmount
     * @param maturity
     */
    public TransactionBank(String customerName, double depositAmount, int maturity) {
        this.customerName = customerName;
        this.depositAmount = depositAmount;
        this.maturity = maturity;
    }

    /**
     * Consumes a deposit amount and produces the actual amount of interest that the money earns in a year
     *
     * @return depositAmount * aFlat
     * Example new TransactionBank("QUoc", 6000, 2).interest() : 300.0
     */
    // Exercise 2.7.1
    public double interest() {

        if (this.depositAmount <= 1000) {
            return this.depositAmount * 0.04;
        }

        if (this.depositAmount > 5000) {
            return this.depositAmount * 0.05;
        }

        return this.depositAmount * 0.045;
    }

    /**
     * consumes a charge amount and computes the corresponding pay-back amount.
     *
     * @return (depositAmount * rate) rely on charges
     * Example new TransactionBank("Spider", 6000, 2).payback() : 48.75
     */
    // Exercise 2.7.2
    public double payback() {
        double rate = 500 * 0.0025;

        if (this.depositAmount <= 500) {
            return this.depositAmount * 0.0025;
        }

        if (this.depositAmount <= 1500) {
            return rate + (this.depositAmount - 500) * 0.005;
        }

        if (this.depositAmount > 2500) {
            return rate + 1000 * 0.005 + 1000 * 0.0075 +
                    (this.depositAmount - 2500) * 0.01;
        }

        return rate + 1000 * 0.005 +
                (this.depositAmount - 1500) * 0.0075;
    }
}
