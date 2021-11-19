package TestExercise3_3;

import Baitap3_3.Date;
import Baitap3_3.TemperatureRange;
import Baitap3_3.WeatherRecord;
import junit.framework.TestCase;

public class TestWeatherRecord extends TestCase {
    private Date monday = new Date(14, 3, 2020);
    private Date tuesday = new Date(28, 2, 2010);
    private Date sunday = new Date(12, 12, 2021);

    private TemperatureRange temperatureRange1 = new TemperatureRange(1, 100);
    private TemperatureRange temperatureRange2 = new TemperatureRange(0, 200);
    private TemperatureRange temperatureRange3 = new TemperatureRange(-1, 100);
    private TemperatureRange temperatureRange4 = new TemperatureRange(-10, 300);


    public void test_WeatherRecord() {
        WeatherRecord weatherRecordA = new WeatherRecord(monday, temperatureRange1, temperatureRange2, temperatureRange3, 12);
        WeatherRecord weatherRecordB = new WeatherRecord(tuesday, temperatureRange4, temperatureRange2, temperatureRange3, 12);
        WeatherRecord weatherRecordC = new WeatherRecord(sunday, temperatureRange1, temperatureRange3, temperatureRange4, 12);

        assertNotNull(weatherRecordA);
        assertNotNull(weatherRecordB);
        assertNotNull(weatherRecordC);
    }

    public void test_WithinRange() {
        WeatherRecord weatherRecordA = new WeatherRecord(monday, temperatureRange1, temperatureRange2, temperatureRange3, 12);
        WeatherRecord weatherRecordB = new WeatherRecord(tuesday, temperatureRange4, temperatureRange2, temperatureRange3, 12);
        WeatherRecord weatherRecordC = new WeatherRecord(sunday, temperatureRange1, temperatureRange3, temperatureRange4, 12);

        assertTrue(weatherRecordA.withinRange());
        assertFalse(weatherRecordB.withinRange());
        assertTrue(weatherRecordC.withinRange());
    }

    public void test_RainyDay() {
        WeatherRecord weatherRecordA = new WeatherRecord(monday, temperatureRange1, temperatureRange2, temperatureRange3, 12);
        WeatherRecord weatherRecordB = new WeatherRecord(tuesday, temperatureRange4, temperatureRange2, temperatureRange3, 12);
        WeatherRecord weatherRecordC = new WeatherRecord(sunday, temperatureRange1, temperatureRange3, temperatureRange4, 12);

        assertTrue(weatherRecordA.rainyDay(12.0));
        assertFalse(weatherRecordB.rainyDay(13.0));
        assertTrue(weatherRecordC.rainyDay(11.0));
    }

    public void test_RecordDay() {
        WeatherRecord weatherRecordA = new WeatherRecord(monday, temperatureRange1, temperatureRange2, temperatureRange3, 12);
        WeatherRecord weatherRecordB = new WeatherRecord(tuesday, temperatureRange4, temperatureRange2, temperatureRange3, 12);
        WeatherRecord weatherRecordC = new WeatherRecord(sunday, temperatureRange1, temperatureRange3, temperatureRange4, 12);

        assertFalse(weatherRecordA.recordDay());
        assertTrue(weatherRecordB.recordDay());
        assertFalse(weatherRecordC.recordDay());
    }
}
