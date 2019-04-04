package org.academiadecodigo.asciimos.hackathlon.dto;

import org.academiadecodigo.asciimos.hackathlon.model.City;
import org.academiadecodigo.asciimos.hackathlon.model.Transport;
import org.springframework.stereotype.Component;

@Component
public class Assembler {
    public CityDto convertToCityDto(City city, Transport transport, boolean twoWay) {
        CityDto cityDto = new CityDto();

        cityDto.setName(city.getName());
        cityDto.setDistance(city.getDistance());
        cityDto.setAvgDailyCost(city.getAvgDailyCost());
        cityDto.setAvgSleepCost(city.getAvgSleepCost());
        cityDto.setTime(city.getTime());

        // DTO TIME MAPS <3
        cityDto.setCost(city.getCostByTransport(transport));

        cityDto.setRouteMap(city.getRouteMapByTransport(transport));

        // DTO TIME INSTANCE <3
        cityDto.setHotels(city.getHotels());
        cityDto.setRestaurants(city.getRestaurants());

        return cityDto;
    }
}
