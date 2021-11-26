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
     * @return city = other city
     * Example :
     * Address address1 = new Address(23, "Maple Street", "Brookline")
     * address1.inThisCity("Brookline") --> Result : true
     */
    public boolean inThisCity(String otherCity) {
        return this.city.equals(otherCity);
    }

    /**
     *
     * @param otherCity
     * @return city = other city
     * Example :
     * Address address1 = new Address(23, "Maple Street", "Brookline")
     * address1.sameCity("Brookline") --> Result : true
     */
    public boolean sameCity(Address otherCity) {
        return this.city.equals(otherCity.city);
    }
}
