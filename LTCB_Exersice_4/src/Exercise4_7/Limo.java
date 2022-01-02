package Exercise4_7;

public class Limo extends ATaxiVehicle {
    public int minRental;

    /**
     * @param idNumber     idNumber
     * @param passengers   passengers
     * @param pricePerMile pricePerMile
     * @param minRental    minRental
     */
    public Limo(int idNumber, int passengers, int pricePerMile, int minRental) {
        super(idNumber, passengers, pricePerMile);
        this.minRental = minRental;
    }

    // passengers in a limo must pay at least the minimum rental fee otherwise they pay by the mile
    @Override
    public double fare(double numberOfMiles) {
        double moneyPaying = this.pricePerMile * numberOfMiles;

        if (moneyPaying < minRental) {
            return minRental;
        }

        return moneyPaying;
    }

    @Override
    public boolean lowerPrice(double numberOfMiles, double amount) {
        return this.fare(numberOfMiles) < amount;
    }

    @Override
    public boolean cheaperThan(double numberOfMiles, ATaxiVehicle otherTaxiVehicle) {
        return this.fare(numberOfMiles) < otherTaxiVehicle.fare(numberOfMiles);
    }
}
