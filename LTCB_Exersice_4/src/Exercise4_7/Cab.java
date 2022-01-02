package Exercise4_7;

public class Cab extends ATaxiVehicle {
    /**
     * @param idNumber     idNumber
     * @param passengers   passengers
     * @param pricePerMile pricePerMile
     */
    public Cab(int idNumber, int passengers, int pricePerMile) {
        super(idNumber, passengers, pricePerMile);
    }

    // passengers in a cab just pay flat fee per mile
    @Override
    public double fare(double numberOfMiles) {
        return this.pricePerMile * numberOfMiles;
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
