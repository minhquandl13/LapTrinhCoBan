package Baitap3_4;

public class Train {
    private Schedule schedule;
    private Route route;
    boolean local;

    /**
     *
     * @param schedule
     * @param route
     * @param local
     */
    public Train(Schedule schedule, Route route, boolean local) {
        this.schedule = schedule;
        this.route = route;
        this.local = local;
    }


}
