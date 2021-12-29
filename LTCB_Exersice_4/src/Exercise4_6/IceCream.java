package Exercise4_6;

public class IceCream extends AnItem {
    private String flavour;
    private String packages;

    /**
     *
     * @param branchName
     * @param weight
     * @param price
     * @param flavour
     * @param packages
     */
    public IceCream(String branchName, double weight, double price, String flavour, String packages) {
        super(branchName, weight, price);
        this.flavour = flavour;
        this.packages = packages;
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
