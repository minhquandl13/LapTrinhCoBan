package Exercise4_7;

public abstract class ATaxiVehicle {
    protected int idNumber;
    protected int passengers;
    protected int pricePerMile;

    /**
     * @param idNumber     idNumber
     * @param passengers   passengers
     * @param pricePerMile pricePerMile
     */
    public ATaxiVehicle(int idNumber, int passengers, int pricePerMile) {
        this.idNumber = idNumber;
        this.passengers = passengers;
        this.pricePerMile = pricePerMile;
    }

    /**
     * computes the fare for a vehicle, based on the number of miles traveled, and using the following
     * formulas for different vehicles
     * Example: <br/>
     * ATaxiVehicle van = new Van(123, 2, 5, true); <br/>
     *
     * @param numberOfMiles numberOfMiles
     * @see double
     */
    public abstract double fare(double numberOfMiles);

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
    public boolean lowerPrice(double numberOfMiles, double amount) {
        return this.fare(numberOfMiles) < amount;
    }

    /**
     * determines whether the fare in one vehicle is lower than the fare in another vehicle for the same number of miles
     * Example: <br/>
     * ClockTime clockTime1 = new ClockTime(3, 31); <br/>
     *
     * @param numberOfMiles numberOfMiles
     * @return true when fare < other fare
     * Or
     * @return false when fare >= other fare
     * @see boolean
     */
    public boolean cheaperThan(double numberOfMiles, ATaxiVehicle otherTaxiVehicle) {
        return this.fare(numberOfMiles) < otherTaxiVehicle.fare(numberOfMiles);
    }
}

