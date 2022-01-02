package Exercise4_7;

public class Van extends ATaxiVehicle {
    public boolean access;

    /**
     * @param idNumber     idNumber
     * @param passengers   passengers
     * @param pricePerMile pricePerMile
     * @param access       access
     */
    public Van(int idNumber, int passengers, int pricePerMile, boolean access) {
        super(idNumber, passengers, pricePerMile);
        this.access = access;
    }

    // passengers in a van pay $1.00 extra for each passenger
    @Override
    public double fare(double numberOfMiles) {
        return this.pricePerMile * numberOfMiles + this.passengers * 1.0;
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
