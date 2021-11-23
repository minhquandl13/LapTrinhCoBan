package Baitap3_4;

public class Train {
    private Schedule schedule;
    private Route route;
    boolean local;

    /**
     * @param schedule Schedule
     * @param route    Route
     * @param local    local
     */
    public Train(Schedule schedule, Route route, boolean local) {
        this.schedule = schedule;
        this.route = route;
        this.local = local;
    }

    /**
     * Determined destination of station same to destination of the train trip
     * Example: <br/>
     * Train trainQ = new Train(schedule2, route2, false); <br/>
     * trainQ.isSameDestination(Train: otherTrain)
     *
     * @param otherTrain Train
     * @return the current train has the same destination to other train or not
     * @see boolean
     */
    public boolean isSameDestination(Train otherTrain) {
        return this.route.isSameDestination(otherTrain.route);
    }

    /**
     * Determined destination of station same to destination of the train trip
     * Example: <br/>
     * Train trainQ = new Train(schedule2, route2, false); <br/>
     * trainQ.isTimeTrainDeparture(Train: otherTrain)
     *
     * @param otherTrain Train
     * @return the current train has the same departure time to other train or not
     * @see boolean
     */
    public boolean isTimeTrainDeparture(Train otherTrain) {
        return this.schedule.isSameTrainDepartureTime(otherTrain.schedule);
    }

    /**
     * Determined the time of train trip take
     * Example: <br/>
     * Train trainA = new Train(schedule1, route1, true); <br/>
     * trainA.getTripTime()
     *
     * @return train trip time
     * @see ClockTime
     */
    public ClockTime getTripTime() {
        return this.schedule.getTripTime();
    }
}