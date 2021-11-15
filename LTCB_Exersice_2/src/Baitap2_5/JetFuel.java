package Baitap2_5;

public class JetFuel {
    int quantitySold;
    String quantityLevel;
    int basePrice;

    /**
     * @param quantitySold
     * @param quantityLevel
     * @param basePrice
     */
    public JetFuel(int quantitySold, String quantityLevel, int basePrice) {
        this.quantitySold = quantitySold;
        this.quantityLevel = quantityLevel;
        this.basePrice = basePrice;
    }

    /**
     * Computes the cost of the sale
     *
     * @return quantitySold * basePrice
     * Example new JetFuel(10, "bad", 100).totalCost() : 1_000
     */
    public int totalCost() {
        return quantitySold * basePrice;
    }

    /**
     * Computes the discounted price
     *
     * @return totalCost * sale rate
     * Example new JetFuel(10, "bad", 100).discountPrice() : 1_000.0
     */
    public double discountPrice() {
        int totalCost = this.totalCost();

        if (totalCost > 100_000) {
            return totalCost * 0.1;
        }

        return totalCost;
    }
}
