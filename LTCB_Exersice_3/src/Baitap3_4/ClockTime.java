package Baitap3_4;

public class ClockTime {
    private int hour;
    private int minute;

    /**
     * @param hour   hour
     * @param minute minute
     */
    public ClockTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    /**
     * Get hour for using in another class
     * Example: <br/>
     * ClockTime clockTime1 = new ClockTime(3, 31); <br/>
     *
     * @return hour
     * @see int
     */
    public int getHour() {
        return hour;
    }
    /**
     * Get minute for using in another class
     * Example: <br/>
     * ClockTime clockTime1 = new ClockTime(3, 31); <br/>
     *
     * @return minute
     * @see int
     */
    public int getMinute() {
        return minute;
    }
}
