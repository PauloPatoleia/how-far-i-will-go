package org.academiadecodigo.asciimos.hackathlon.service;

import org.academiadecodigo.asciimos.hackathlon.model.City;
import org.academiadecodigo.asciimos.hackathlon.model.Transport;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {

    private List<City> cityList;

    public CityService() {
        cityList = new ArrayList<>();

        cityList.add(new City("Porto", 244, 200, 45, 22)
        .addTransport(Transport.BUS, 17.90d).addTransport(Transport.CAR, 34.74d)
        .addCommonSources("caralho.com", "atuaprimade4.com")
        .addRouteMap(Transport.BUS, "routebus.com").addRouteMap(Transport.CAR, "routecar.com"));

        /*cityList.add(new City("Madrid", 285, 396, 60, 24).addTransport(Transport.BUS, 38.00d).addTransport(Transport.CAR, 38.02d));
        cityList.add(new City("Barcelona", 660, 1013, 60, 26).addTransport(Transport.BUS, 117.00d).addTransport(Transport.CAR, 128.72d));
        cityList.add(new City("Paris", 1172, 1525, 120, 26).addTransport(Transport.BUS, 91.00d).addTransport(Transport.CAR, 147.24d));
        cityList.add(new City("Amsterdam", 1440, 2043, 80, 21).addTransport(Transport.BUS, 100.00d).addTransport(Transport.CAR, 215.71d));
        cityList.add(new City("Berlin", 1680, 2515, 40, 25).addTransport(Transport.BUS, 130.00d).addTransport(Transport.CAR, 257.78));
        cityList.add(new City("London", 1440, 1920, 70, 28).addTransport(Transport.BUS, 147.00d).addTransport(Transport.CAR, 246.52d)); */

    }

    public List<City> getCityList() {
        return cityList;
    }

    public City getFurthestCity(int budget, Transport transport) {
        City choosenCity = null;

        for(City city : cityList) {

            if(choosenCity == null) {
                choosenCity = city;
            }

            // price is bigger than the required
            if(city.getCostByTransport(transport) > budget) {
                continue;
            }

            // city has worst range for the money
            if(city.getDistance() < choosenCity.getDistance()) {
                continue;
            }

           choosenCity = city;
        }
        return choosenCity;
    }

    public City getCityName(String cityName) {
        for(City city : cityList) {
            if(city.getName().equalsIgnoreCase(cityName)) {
                return city;
            }
        }
        return null;
    }

    public City getCityPrice(int price) {
        return null;
    }
}
