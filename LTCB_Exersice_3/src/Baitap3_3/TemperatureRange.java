package Baitap3_3;

public class TemperatureRange {
    private int low;
    private int high;

    /**
     * @param low
     * @param high
     */
    public TemperatureRange(int low, int high) {
        this.low = low;
        this.high = high;
    }

    /**
     *
     * @param otherTemperatureRange
     * @return low >= otherTemperatureRange low
     *         high <= otherTemperatureRange high
     * Example :
     * TemperatureRange temperatureRange1 = new TemperatureRange(1, 100)
     * TemperatureRange temperatureRange2 = new TemperatureRange(-1, 50)
     * temperatureRange1.within(temperatureRange2) --> Result : false
     */
    public boolean within(TemperatureRange otherTemperatureRange) {
        return (this.low >= otherTemperatureRange.low)
                && (this.high <= otherTemperatureRange.high);
    }
}
