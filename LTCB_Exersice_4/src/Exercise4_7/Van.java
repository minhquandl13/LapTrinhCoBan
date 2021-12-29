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

    /**
     * computes the fare for a vehicle, based on the number of miles traveled, and using the following
     * formulas for different vehicles
     * Example: <br/>
     * ClockTime clockTime1 = new ClockTime(3, 31); <br/>
     *
     * @return pricePerMile * numberOfMiles + passengers
     * @see double
     */
    @Override
    public double fare(double numberOfMiles)
    {
        return this.pricePerMile * numberOfMiles + this.passengers * 1.0;
    }

    /**
     * determines whether the fare for a given number of miles is lower than some amount
     * Example: <br/>
     * ClockTime clockTime1 = new ClockTime(3, 31); <br/>
     *
     * @return true when fare < amount
     * Or
     * @return false when fare >= amount
     * @see boolean
     */
    @Override
    public boolean lowerPrice(double numberOfMiles, double amount)
    {
        return this.fare(numberOfMiles) < amount;
    }

    /**
     * determines whether the fare in one vehicle is lower than the fare in another vehicle for the same number of miles
     * Example: <br/>
     * ClockTime clockTime1 = new ClockTime(3, 31); <br/>
     *
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
