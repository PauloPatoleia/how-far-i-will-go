package org.academiadecodigo.asciimos.hackathlon.dto;

public class CityDto {

    private String name;

    private Double cost;

    private int time;
    private int distance;

    private int avgSleepCost;
    private int avgDailyCost;

    private String Hotels;
    private String Restaurants;
    private String routeMap;

    private int temperature;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getAvgSleepCost() {
        return avgSleepCost;
    }

    public void setAvgSleepCost(int avgSleepCost) {
        this.avgSleepCost = avgSleepCost;
    }

    public int getAvgDailyCost() {
        return avgDailyCost;
    }

    public void setAvgDailyCost(int avgDailyCost) {
        this.avgDailyCost = avgDailyCost;
    }

    public String getHotels() {
        return Hotels;
    }

    public void setHotels(String hotels) {
        Hotels = hotels;
    }

    public String getRestaurants() {
        return Restaurants;
    }

    public void setRestaurants(String restaurants) {
        Restaurants = restaurants;
    }

    public String getRouteMap() {
        return routeMap;
    }

    public void setRouteMap(String routeMap) {
        this.routeMap = routeMap;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
