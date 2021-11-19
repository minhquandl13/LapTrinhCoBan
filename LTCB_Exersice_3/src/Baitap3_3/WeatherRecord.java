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
    public WeatherRecord(Date date, TemperatureRange temperatureRangeToday, TemperatureRange temperatureRangeNormal,
                         TemperatureRange temperatureRangeRecord, double precipitation) {
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
     * Date monday = new Date(14, 3, 2020)
     * TemperatureRange temperatureRange1 = new TemperatureRange(1, 100)
     * TemperatureRange temperatureRange2 = new TemperatureRange(0, 200)
     * TemperatureRange temperatureRange3 = new TemperatureRange(-1, 100)
     * WeatherRecord weatherRecordA = new WeatherRecord(monday, temperatureRange1, temperatureRange2, temperatureRange3, 12)
     * weatherRecordA.withinRange() --> Result : true
     */
    public boolean withinRange() {
        return this.temperatureRangeToday.within(this.temperatureRangeNormal);
    }

    /**
     * Determines whether the precipitation is higher than some given value
     *
     * @param otherPrecipitation
     * @return precipitation >= other Precipitation
     * Example :
     * Date monday = new Date(14, 3, 2020)
     * TemperatureRange temperatureRange1 = new TemperatureRange(1, 100)
     * TemperatureRange temperatureRange2 = new TemperatureRange(0, 200)
     * TemperatureRange temperatureRange3 = new TemperatureRange(-1, 100)
     * WeatherRecord weatherRecordA = new WeatherRecord(monday, temperatureRange1, temperatureRange2, temperatureRange3, 12)
     * weatherRecordA.rainyDay() --> Result : true
     */
    public boolean rainyDay(double otherPrecipitation) {
        return this.precipitation >= otherPrecipitation;
    }

    /**
     * Determines whether the temperature today broke either the high or the low record
     *
     * @return not ( (temperatureRangeToday low >= temperatureRangeRecord low) and (temperatureRangeToday high <= temperatureRangeRecord high) )
     * Example :
     * Date monday = new Date(14, 3, 2020)
     * TemperatureRange temperatureRange1 = new TemperatureRange(1, 100)
     * TemperatureRange temperatureRange2 = new TemperatureRange(0, 200)
     * TemperatureRange temperatureRange3 = new TemperatureRange(-1, 100)
     * WeatherRecord weatherRecordA = new WeatherRecord(monday, temperatureRange1, temperatureRange2, temperatureRange3, 12)
     * weatherRecordA.recordDay() --> Result : false
     */
    public boolean recordDay() {
        return !this.temperatureRangeToday.within(this.temperatureRangeRecord);
    }
}
