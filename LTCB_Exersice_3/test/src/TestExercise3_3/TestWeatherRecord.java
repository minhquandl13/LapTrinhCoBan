package TestExercise3_3;

import Baitap3_3.Date;

import Baitap3_3.TemperatureRange;
import Baitap3_3.WeatherRecord;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestWeatherRecord {
    private Date monday;
    private Date tuesday;
    private Date sunday;

    private TemperatureRange temperatureRange1;
    private TemperatureRange temperatureRange2;
    private TemperatureRange temperatureRange3;
    private TemperatureRange temperatureRange4;

    private WeatherRecord weatherRecordA;
    private WeatherRecord weatherRecordB;
    private WeatherRecord weatherRecordC;

    @Before
    public void setUpTestcase() {
        monday = new Date(14, 3, 2020);
        tuesday = new Date(28, 2, 2010);
        sunday = new Date(12, 12, 2021);

        temperatureRange1 = new TemperatureRange(1, 100);
        temperatureRange2 = new TemperatureRange(0, 200);
        temperatureRange3 = new TemperatureRange(-1, 100);
        temperatureRange4 = new TemperatureRange(-10, 300);

        weatherRecordA = new WeatherRecord(monday, temperatureRange1, temperatureRange2, temperatureRange3, 12);
        weatherRecordB = new WeatherRecord(tuesday, temperatureRange4, temperatureRange2, temperatureRange3, 12);
        weatherRecordC = new WeatherRecord(sunday, temperatureRange1, temperatureRange3, temperatureRange4, 12);
    }

    @Test
    public void test_WeatherRecord() {
        assertNotNull(weatherRecordA);
        assertNotNull(weatherRecordB);
        assertNotNull(weatherRecordC);
    }

    @Test
    public void test_WithinRange() {
        assertTrue(weatherRecordA.withinRange());
        assertFalse(weatherRecordB.withinRange());
        assertTrue(weatherRecordC.withinRange());
    }

    @Test
    public void test_RainyDay() {
        assertTrue(weatherRecordA.rainyDay(12.0));
        assertFalse(weatherRecordB.rainyDay(13.0));
        assertTrue(weatherRecordC.rainyDay(11.0));
    }

    @Test
    public void test_RecordDay() {
        assertFalse(weatherRecordA.recordDay());
        assertTrue(weatherRecordB.recordDay());
        assertFalse(weatherRecordC.recordDay());
    }
}
