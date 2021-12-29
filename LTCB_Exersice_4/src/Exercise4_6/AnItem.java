package Exercise4_6;

public abstract class AnItem {
    protected String branchName;
    protected double weight;
    protected double price;

    /**
     *
     * @param branchName
     * @param weight
     * @param price
     */
    public AnItem(String branchName, double weight, double price) {
        this.branchName = branchName;
        this.weight = weight;
        this.price = price;
    }

    public double unitPrice() {
        return this.price / this.weight;
    }

    public boolean lowerPrice(double amount) {
        return this.unitPrice() < amount;
    }

    public boolean cheaperThan(AnItem otherItem) {
        return this.unitPrice() < otherItem.unitPrice();
    }
}
