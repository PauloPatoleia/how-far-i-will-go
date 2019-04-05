package org.academiadecodigo.asciimos.hackathlon.model;

import org.academiadecodigo.asciimos.hackathlon.model.sources.CommonSources;

import java.util.HashMap;
import java.util.Map;

public class City {

    private String name;

    private Map<Transport, Double> transportMap;
    private Map<Transport, String> transportRouteMap;
    private CommonSources commonSources;

    private int time;
    private int distance;
    private int temperature;

    private int avgSleepCost;
    private int avgDailyCost;

    public City(String name, int time, int distance, int temperature, int avgSleepCost, int avgDailyCost) {
        transportMap = new HashMap<>();
        transportRouteMap = new HashMap<>();

        this.name = name;
        this.time = time;
        this.distance = distance;
        this.temperature = temperature;
        this.avgSleepCost = avgSleepCost;
        this.avgDailyCost = avgDailyCost;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public int getDistance() {
        return distance;
    }

    public int getAvgSleepCost() {
        return avgSleepCost;
    }

    public int getAvgDailyCost() {
        return avgDailyCost;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getHotels() {
        return commonSources.getHotels();
    }

    public String getRestaurants() {
        return commonSources.getRestaurants();
    }

    public double getCostByTransport(Transport transport) {
        return transportMap.get(transport);
    }

    public String getRouteMapByTransport(Transport transport) {
        return transportRouteMap.get(transport);
    }

    public City addTransport(Transport transport, double cost) {
        transportMap.put(transport, cost);
        return this;
    }

    public City addRouteMap(Transport transport, String route) {
        transportRouteMap.put(transport, route);
        return this;
    }

    public City addCommonSources(String hotels, String restaurants) {
        commonSources = new CommonSources(hotels, restaurants);
        return this;
    }
}
