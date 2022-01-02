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
     * Computes the fare for a vehicle, based on the number of miles traveled, and using the following
     * formulas for different vehicles
     * <p>
     * Example: <br/>
     * ATaxiVehicle van = new Van(123, 2, 5, true); <br/>
     * van.fare(2.0) --> fare of van = 12.0
     * @param numberOfMiles numberOfMiles
     * @return true when fare < amount or false when fare >= amount
     * @see double
     */
    public abstract double fare(double numberOfMiles);

    /**
     * Determines whether the fare for a given number of miles is lower than some amount
     * Example: <br/>
     * ATaxiVehicle van = new Van(123, 2, 5, true); <br/>
     * van.lowerPrice(2.0, 3.0)  --> False
     * @param numberOfMiles numberOfMiles
     * @param amount        amount
     * @return true or false
     * @see boolean
     */
    public boolean lowerPrice(double numberOfMiles, double amount) {
        return this.fare(numberOfMiles) < amount;
    }

    /**
     * Determines whether the fare in one vehicle is lower than the fare in another vehicle
     * for the same number of miles
     * <p>
     * Example: <br/>
     * ATaxiVehicle van = new Van(123, 2, 5, true); <br/>
     * ATaxiVehicle van1 = new Van(1223, 3, 5, false); <br/>
     * van.cheaperThan(2.0, van1) --> True
     *
     * @param numberOfMiles    numberOfMiles
     * @param otherTaxiVehicle otherTaxiVehicle
     * @return true or false
     * @see boolean
     */
    public boolean cheaperThan(double numberOfMiles, ATaxiVehicle otherTaxiVehicle) {
        return this.fare(numberOfMiles) < otherTaxiVehicle.fare(numberOfMiles);
    }
}

