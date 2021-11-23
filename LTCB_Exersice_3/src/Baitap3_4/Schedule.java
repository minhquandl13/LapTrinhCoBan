package Baitap3_4;

import java.time.Duration;
import java.time.LocalTime;

public class Schedule {
    private ClockTime departureTime;
    private ClockTime arriveTime;

    /**
     * @param clockTimeDeparture
     * @param clockTimeArrive
     */
    public Schedule(ClockTime clockTimeDeparture, ClockTime clockTimeArrive) {
        this.departureTime = clockTimeDeparture;
        this.arriveTime = clockTimeArrive;
    }

    /**
     * Determined departure time of station same to departure time of the train trip
     * Example: <br/>
     * Schedule schedule1 = new Schedule(clockTime1, clockTime3, true); <br/>
     * schedule1.isSameTrainDepartureTime(Schedule: otherSchedule)
     *
     * @param otherSchedule Schedule
     * @return the current train has the same departure time to other train or not
     * @see boolean
     */
    public boolean isSameTrainDepartureTime(Schedule otherSchedule) {
        return this.departureTime.equals(otherSchedule.departureTime);
    }

    /**
     * Determined the time of train trip take
     * Example: <br/>
     * Schedule schedule1 = new Schedule(clockTime1, clockTime3); <br/>
     * schedule1.getTripTime()
     *
     * @return train trip time
     * @see ClockTime
     */
    public ClockTime getTripTime() {
        LocalTime departureLocalTime = LocalTime.of(this.departureTime.getHour(), this.departureTime.getMinute());
        LocalTime arriveLocalTime = LocalTime.of(this.arriveTime.getHour(), this.arriveTime.getMinute());

        Duration duration = Duration.between(arriveLocalTime, departureLocalTime);
        long totalMinutes = Math.abs(duration.toMinutes());

        int tripHour = (int) totalMinutes / 60;
        int tripMinute = (int) totalMinutes % 60;

        ClockTime tripTime = new ClockTime(tripHour, tripMinute);
        return tripTime;
    }

//    public ClockTime getTripTime1() {
//        LocalTime departureLocalTime = LocalTime.of(departureTime.getHour(), departureTime.getMinute());
//        LocalTime arriveLocalTime = LocalTime.of(arriveTime.getHour(), arriveTime.getMinute());
//
//        Duration duration = Duration.between(departureLocalTime, arriveLocalTime);
//        long totalMinutes = Math.abs(duration.toMinutes());
//
//        int tripHour = (int)totalMinutes / 60;
//        int tripMinute = (int)totalMinutes % 60;
//
//        ClockTime tripTime = new ClockTime(tripHour, tripMinute);
//        return tripTime;
//}
}
