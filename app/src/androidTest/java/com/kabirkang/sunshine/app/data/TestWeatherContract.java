package com.kabirkang.sunshine.app.data;

import android.net.Uri;
import android.test.AndroidTestCase;
import android.util.Log;

/**
 * Created by kabir on 11/2/2016.
 */

public class TestWeatherContract extends AndroidTestCase {
    private static final String TEST_WEATHER_LOCATION = "/North Pole";
    private static final long TEST_WEATHER_DATE = 1419033600L;

    public void testBuildWeatherLocation() {
        Uri locationUri = WeatherContract.WeatherEntry.buildWeatherLocation(TEST_WEATHER_LOCATION);
        assertNotNull("Error: Null Uri returned.  You must fill-in buildWeatherLocation in " +
                        "WeatherContract.",
                locationUri);
        assertEquals("Error: Weather location not properly appended to the end of the Uri",
                TEST_WEATHER_LOCATION, locationUri.getLastPathSegment());
        Log.d("LOG", locationUri.toString());
        assertEquals("Error: Weather location Uri doesn't match our expected result",
                locationUri.toString(),
                "content://com.kabirkang.sunshine.app/weather/%2FNorth%20Pole");
    }
}
