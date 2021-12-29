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

    /**
     * computes the fare for a vehicle, based on the number of miles traveled, and using the following
     * formulas for different vehicles
     * Example: <br/>
     * ClockTime clockTime1 = new ClockTime(3, 31); <br/>
     *
     * @param numberOfMiles numberOfMiles
     * @return minRental or moneyPaying
     * @see double
     */
    @Override
    public double fare(double numberOfMiles) {
        double moneyPaying = this.pricePerMile * numberOfMiles;

        if (moneyPaying < minRental) {
            return minRental;
        }

        return moneyPaying;
    }

    /**
     * determines whether the fare for a given number of miles is lower than some amount
     * Example: <br/>
     * ClockTime clockTime1 = new ClockTime(3, 31); <br/>
     *
     * @param numberOfMiles numberOfMiles
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
