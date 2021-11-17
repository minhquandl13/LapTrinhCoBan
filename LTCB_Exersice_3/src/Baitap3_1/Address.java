package Baitap3_1;

public class Address {
    private int houseNumber;
    private String streetName;
    private String city;

    /**
     *
     * @param houseNumber
     * @param streetName
     * @param city
     */
    public Address(int houseNumber, String streetName, String city) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
    }

    /**
     *
     * @param otherCity
     * @return city
     */
    public boolean inThisCity(String otherCity) {
        return this.city.equals(otherCity);
    }

    /**
     *
     * @param otherCity
     * @return city
     */
    public boolean sameCity(String otherCity) {
        return this.city.equals(otherCity);
    }
}
