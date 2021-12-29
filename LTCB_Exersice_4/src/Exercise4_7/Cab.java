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

    /**
     * computes the fare for a vehicle, based on the number of miles traveled, and using the following
     * formulas for different vehicles
     * Example: <br/>
     * ClockTime clockTime1 = new ClockTime(3, 31); <br/>
     *
     * @param numberOfMiles numberOfMiles
     * @return pricePerMile * numberOfMiles
     * @see double
     */
    @Override
    public double fare(double numberOfMiles) {
        return this.pricePerMile * numberOfMiles;
    }

    /**
     * determines whether the fare for a given number of miles is lower than some amount
     * Example: <br/>
     * ClockTime clockTime1 = new ClockTime(3, 31); <br/>
     *
     * @param numberOfMiles numberOfMiles
     * @param amount
     * @return true when fare < amount
     * Or
     * @return false when fare >= amount
     * @see boolean
     */
    @Override
    public boolean lowerPrice(double numberOfMiles, double amount) {
        return this.fare(numberOfMiles) < amount;
    }

    /**
     * determines whether the fare in one vehicle is lower than the fare in another vehicle for the same number of miles
     * Example: <br/>
     * ClockTime clockTime1 = new ClockTime(3, 31); <br/>
     *
     * @param numberOfMiles    numberOfMiles
     * @param otherTaxiVehicle otherTaxiVehicle
     * @return true when fare < other fare
     * Or
     * @return false when fare >= other fare
     * @see boolean
     */
    @Override
    public boolean cheaperThan(double numberOfMiles, ATaxiVehicle otherTaxiVehicle) {
        return this.fare(numberOfMiles) < otherTaxiVehicle.fare(numberOfMiles);
    }
}
