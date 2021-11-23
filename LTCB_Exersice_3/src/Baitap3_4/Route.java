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

    /**
     * Determined destination of station same to destination of the train trip
     * Example: <br/>
     * Route route1 = new Route("Ha Noi", "Sai Gon"); <br/>
     * route1.isSameDestination(Route: otherRoute)
     * @param otherRoute Route
     * @return the current route has the same destination to other route or not
     * @see ClockTime
     */
    public boolean isSameDestination(Route otherRoute) {
        return this.destination.equals(otherRoute.destination);
    }
}
