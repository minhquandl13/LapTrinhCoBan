package Baitap2_4;

public class Coffee {
    String kind;
    double price;
    double weight;

    /**
     * @param kind
     * @param price
     * @param weight
     */
    public Coffee(String kind, double price, double weight) {
        this.kind = kind;
        this.price = price;
        this.weight = weight;
    }

    /**
     * computes the cost of selling bulk coffee at a specialty coffee seller from a receipt
     *
     * @return totalPrice * sales rate
     * Example new Coffee("NetCafe", 3_000, 1).cost() : 3_000
     */
    public double cost() {
        double totalPrice = this.price * this.weight;
        if (totalPrice < 5_000) {
            return totalPrice;
        }

        if (totalPrice >= 20_000) {
            return totalPrice * 0.25;
        }

        return totalPrice * 0.1;
    }
}
