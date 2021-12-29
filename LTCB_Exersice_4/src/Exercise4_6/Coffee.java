package Exercise4_6;

public class Coffee extends AnItem {
    private String label;

    /**
     *
     * @param branchName
     * @param weight
     * @param price
     * @param label
     */
    public Coffee(String branchName, double weight, double price, String label) {
        super(branchName, weight, price);
        this.label = label;
    }

    @Override
    public double unitPrice() {
        return this.price / this.weight;
    }

    @Override
    public boolean lowerPrice(double amount) {
        return this.unitPrice() < amount;
    }

    @Override
    public boolean cheaperThan(AnItem otherItem) {
        return this.unitPrice() < otherItem.unitPrice();
    }
}
