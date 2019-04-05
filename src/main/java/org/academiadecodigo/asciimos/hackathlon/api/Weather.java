package org.academiadecodigo.asciimos.hackathlon.api;

public class Weather {

    private double temperature;
    private String status;
    private String description;

    public Weather(double temperature, String status, String description) {
        this.temperature = temperature;
        this.status = status;
        this.description = description;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
