package org.academiadecodigo.asciimos.hackathlon.api;

import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;

public class WeatherAPI {

    private static final String KEY = "8f95f78f58e5988c4ec3d3c52889f5f0";

    public static Weather getWeather(String city) {
        try {
            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + KEY);
            String response = (String) url.openConnection().getContent();

            JSONObject obj = new JSONObject(response);

            double temperature = obj.getJSONObject("main").getDouble("temp");
            String status = obj.getJSONObject("weather").getString("main");
            String description = obj.getJSONObject("weather").getString("description");

            return new Weather(temperature, status, description);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
