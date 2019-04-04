package org.academiadecodigo.asciimos.hackathlon.model.sources;

public class CommonSources {
    private String hotels;
    private String restaurants;

    public CommonSources(String hotels, String restaurants) {
        this.hotels = hotels;
        this.restaurants = restaurants;
    }

    public String getHotels() {
        return hotels;
    }

    public String getRestaurants() {
        return restaurants;
    }
}
