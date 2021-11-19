package Baitap3_3;

public class WeatherRecord {
    private Date date;
    private TemperatureRange temperatureRangeToday;
    private TemperatureRange temperatureRangeNormal;
    private TemperatureRange temperatureRangeRecord;
    private double precipitation;

    /**
     * @param date
     * @param temperatureRangeToday
     * @param temperatureRangeNormal
     * @param temperatureRangeRecord
     * @param precipitation
     */
    public WeatherRecord(Date date, TemperatureRange temperatureRangeToday, TemperatureRange temperatureRangeNormal, TemperatureRange temperatureRangeRecord, double precipitation) {
        this.date = date;
        this.temperatureRangeToday = temperatureRangeToday;
        this.temperatureRangeNormal = temperatureRangeNormal;
        this.temperatureRangeRecord = temperatureRangeRecord;
        this.precipitation = precipitation;
    }

    /**
     * Determines whether today's high and low were within the normal range
     *
     * @return Example :
     */
    public boolean withinRange() {
        return this.temperatureRangeToday.within(this.temperatureRangeNormal);
    }
}
