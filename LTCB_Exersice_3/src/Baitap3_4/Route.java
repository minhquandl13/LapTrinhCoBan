package Baitap3_4;

public class Route {
    private String origin;
    private String destination;

    /**
     *
     * @param origin
     * @param destination
     */
    public Route(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public boolean isDestination(String otherDestination) {
        return true;
    }
}
