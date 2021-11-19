package Baitap3_4;

import java.time.Duration;
import java.time.LocalDateTime;
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

    public boolean isTimeTrainDeparture(Schedule otherSchedule) {
        return this.departureTime.equals(otherSchedule.departureTime);
    }

    public ClockTime getTripTime() {
        LocalTime departureLocalTime = LocalTime.of(this.departureTime.getHour(), this.departureTime.getMinute());
        LocalTime arriveLocalTime = LocalTime.of(this.arriveTime.getHour(), this.arriveTime.getMinute());

        Duration duration = Duration.between(arriveLocalTime, departureLocalTime);
        long totalMinutes = Math.abs(duration.toMinutes());

        int tripHour = (int)totalMinutes / 60;
        int tripMinute = (int)totalMinutes % 60;

        ClockTime tripTime = new ClockTime(tripHour, tripMinute);
        return tripTime;
    }
}
