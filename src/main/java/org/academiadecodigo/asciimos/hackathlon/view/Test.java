package org.academiadecodigo.asciimos.hackathlon.view;


import org.academiadecodigo.asciimos.hackathlon.model.City;
import org.academiadecodigo.asciimos.hackathlon.model.Transport;
import org.academiadecodigo.asciimos.hackathlon.service.CityService;

public class Test {

    public static void main(String[] args) {
        CityService cityService = new CityService();

        City city = cityService.getFurthestCity(200, Transport.CAR);

        System.out.println("City: " + city.getName());
        System.out.println("Cost: " + city.getCostByTransport(Transport.CAR));
        System.out.println("Distance: " + city.getDistance());
    }
}