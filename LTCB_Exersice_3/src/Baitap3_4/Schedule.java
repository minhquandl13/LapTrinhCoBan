package Baitap3_4;

public class Schedule {
    private ClockTime clockTimeDeparture;
    private ClockTime clockTimeArrive;

    /**
     *
     * @param clockTimeDeparture
     * @param clockTimeArrive
     */
    public Schedule(ClockTime clockTimeDeparture, ClockTime clockTimeArrive) {
        this.clockTimeDeparture = clockTimeDeparture;
        this.clockTimeArrive = clockTimeArrive;
    }
}
