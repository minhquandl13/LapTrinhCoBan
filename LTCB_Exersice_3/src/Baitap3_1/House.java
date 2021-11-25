package Baitap3_1;

public class House {
    private String kind;
    private int numberOfRoom;
    private double price;
    private Address address;

    /**
     * @param kind
     * @param numberOfRoom
     * @param price
     * @param address
     */
    public House(String kind, int numberOfRoom, double price, Address address) {
        this.kind = kind;
        this.numberOfRoom = numberOfRoom;
        this.price = price;
        this.address = address;
    }

    /**
     * Determines whether one house has more rooms than some other house
     * @return numberOfRoom > numberOfRoom
     * Example:
     * Address address1 = new Address(23, "Maple Street", "Brookline")
     * Address address2 = new Address(5, "Joye Road", "Newton")
     * House houseA = new House("Ranch", 7, 375.000, address1)
     * House houseB = new House("Colonial", 9, 450.000, address2)
     * houseA.hasMoreRoom.houseB --> Result : false
     */
    public boolean hasMoreRoom(House other) {
        return this.numberOfRoom > other.numberOfRoom;
    }

    /**
     * Checks whether the advertised house is in some given city
     * @return address
     * Example :
     * Address address1 = new Address(23, "Maple Street", "Brookline")
     * House houseA = new House("Ranch", 7, 375.000, address1)
     * houseA.inTHisCity("Brookline") --> Result : true
     */
    public boolean inThisCity(String city) {
        return this.address.inThisCity(city);
    }

    /**
     * Determines whether one house is in the same city as some other house.
     * @return address
     * Example :
     * Address address1 = new Address(23, "Maple Street", "Brookline")
     * House houseA = new House("Ranch", 7, 375.000, address1)
     * houseA.sameCity("Brookline") --> Result : true
     */
    public boolean sameCity(House othercity) {
        return this.address.sameCity(othercity);
    }
}

