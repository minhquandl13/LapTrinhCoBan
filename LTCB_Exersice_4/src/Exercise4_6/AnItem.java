package Exercise4_6;

public abstract class AnItem {
    protected String branchName;
    protected double weight;
    protected double price;

    /**
     * @param branchName branchName
     * @param weight     weight
     * @param price      price
     */
    public AnItem(String branchName, double weight, double price) {
        this.branchName = branchName;
        this.weight = weight;
        this.price = price;
    }

    /**
     * Computes the unit price (cents per gram) of some grocery item
     * <p>
     * Example: <br/>
     * AnItem sorbet = new IceCream("Nestle", 10.1, 10.1, "Sorbet", "Sorbet") <br/>
     * sorbet.unitPrice() --> unit price = 1.0
     *
     * @return price / weight
     * @see double
     */
    public double unitPrice() {
        return this.price / this.weight;
    }

    /**
     * @param amount
     * Determines whether the unit price of some grocery item is lower than some givens amount
     * <p>
     * Example: <br/>
     * AnItem sorbet = new IceCream("Nestle", 10.1, 10.1, "Sorbet", "Sorbet") <br/>
     * sorbet.lowerPrice(2.0) --> True
     *
     * @return true or false
     * @see boolean
     */
    public boolean lowerPrice(double amount) {
        return this.unitPrice() < amount;
    }

    /**
     * @param otherItem
     * determines whether a grocery itembis cheaper than some other, given one in terms of the unit cost
     * <p>
     * Example: <br/>
     * AnItem sorbet = new IceCream("Nestle", 10.1, 10.1, "Sorbet", "Sorbet"); <br/>
     * <p>
     * AnItem frozenYogurt = new IceCream("Magnum", 2.3, 1, "Frozen Yogurt", "Frozen Yogurt"); <br/>
     * frozenYogurt.cheaperThan(sorbet) --> True
     *
     * @return true or false
     * @see boolean
     */
    public boolean cheaperThan(AnItem otherItem) {
        return this.unitPrice() < otherItem.unitPrice();
    }
}
