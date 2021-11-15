package Baitap2_2;

public class MovieShow {
    double ticketPrice;
    double costForPerformance;
    double costForAttendee;

    /**
     * @param ticketPrice
     * @param costForPerformance
     * @param costForAttendee
     */
    public MovieShow(double ticketPrice, double costForPerformance, double costForAttendee) {
        this.ticketPrice = ticketPrice;
        this.costForPerformance = costForPerformance;
        this.costForAttendee = costForAttendee;
    }

    /**
     * Compute cost for per Attendee
     *
     * @param numberOfAttendee
     * @return costForPerformance + costForAttendee * numberOfAttendee(100)
     * Example new MovieShow(5.0, 20.0, 0.15).cost(100) : 500.0
     */
    public double cost(int numberOfAttendee) {
        return this.costForPerformance
                + this.costForAttendee * numberOfAttendee;
    }

    /**
     * Compute revenue for per Attendee
     *
     * @param numberOfAttendee
     * @return ticketPrice * numberOfAttendee
     * Example new MovieShow(5.0, 20.0, 0.15).revenue(100) : 500.0
     */
    public double revenue(int numberOfAttendee) {
        return this.ticketPrice * numberOfAttendee;
    }

    /**
     * Compute totalProfit for each Attendee
     *
     * @param numberOfAttendee
     * @return revenue(numberOfAttendee : 100) - cót(numberOfAttendee: 100)
     * Example new MovieShow(5.0, 20.0, 0.15).totalProfit() : 465.0
     */
    public double totalProfit(int numberOfAttendee) {
        return this.revenue(numberOfAttendee) - this.cost(numberOfAttendee);
    }
}
