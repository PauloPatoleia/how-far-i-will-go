package org.academiadecodigo.asciimos.hackathlon.model;

import org.academiadecodigo.asciimos.hackathlon.model.sources.CommonSources;

import java.util.HashMap;
import java.util.Map;

public class City {

    private String name;

    private Map<Transport, Double> transportMap;
    private Map<Transport, String> transportRouteMap;
    private Map<Transport, Integer> transportTimeMap;

    private CommonSources commonSources;

    private int distance;
    private int temperature;

    private int avgSleepCost;
    private int avgDailyCost;

    public City(String name, int distance, int temperature, int avgSleepCost, int avgDailyCost) {
        transportMap = new HashMap<>();
        transportRouteMap = new HashMap<>();
        transportTimeMap = new HashMap<>();

        this.name = name;
        this.distance = distance;
        this.temperature = temperature;
        this.avgSleepCost = avgSleepCost;
        this.avgDailyCost = avgDailyCost;
    }

    public String getName() {
        return name;
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

    public Integer getTimeByTransport(Transport transport) {
        return transportTimeMap.get(transport);
    }

    public City addTransport(Transport transport, double cost) {
        transportMap.put(transport, cost);
        return this;
    }

    public City addRouteMap(Transport transport, String route) {
        transportRouteMap.put(transport, route);
        return this;
    }

    public City addTimeMap(Transport transport, Integer time) {
        transportTimeMap.put(transport, time);
        return this;
    }

    public City addCommonSources(String hotels, String restaurants) {
        commonSources = new CommonSources(hotels, restaurants);
        return this;
    }
}
