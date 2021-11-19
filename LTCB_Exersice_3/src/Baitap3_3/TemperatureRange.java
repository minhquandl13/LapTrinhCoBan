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
     */
    public boolean within(TemperatureRange otherTemperatureRange) {
        return (this.low >= otherTemperatureRange.low)
                && (this.high <= otherTemperatureRange.high);
    }
}
