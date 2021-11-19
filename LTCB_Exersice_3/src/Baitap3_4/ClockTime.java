package Baitap3_4;

public class ClockTime {
    private int hour;
    private int minute;

    /**
     *
     * @param hour
     * @param minute
     */
    public ClockTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
