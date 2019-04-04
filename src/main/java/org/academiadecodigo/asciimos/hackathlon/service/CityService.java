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
                .addCommonSources("https://www.trivago.pt/?aDateRange%5Barr%5D=2019-04-22&aDateRange%5Bdep%5D=2019-04-23&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=31823%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0",
                        "https://www.tripadvisor.pt/Restaurants-g189180-Porto_Porto_District_Northern_Portugal.html")
                .addRouteMap(Transport.BUS, "https://www.rede-expressos.pt/tickets?destination=100&source=303")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=Porto%2C%20Portugal&arrivalId=31NDF4dnIxMGNOREV1TVRVd05UVT1jTFRndU5qRXdNdz09&index=1&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption="));

        cityList.add(new City("Madrid", 285, 396, 60, 24)
                .addTransport(Transport.BUS, 38.00d).addTransport(Transport.CAR, 38.02d)
                .addCommonSources("https://www.trivago.pt/?aDateRange%5Barr%5D=2019-04-22&aDateRange%5Bdep%5D=2019-04-23&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=13628%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0",
                        "https://www.tripadvisor.pt/Restaurants-g187514-Madrid.html")
                .addRouteMap(Transport.BUS, "https://www.omio.pt/search-frontend/results/1300912268/bus?locale=pt&abTestParameters=&adults=1&arrival_fk=378655&children=0&departure_date=05/04/2019&departure_fk=398743&infants=0&is_rebrand=true&passengerAges=%5Bobject+Object%5D&travel_mode=train&user_currency=EUR&user_domain=pt&user_id=905cb95c-a692-45aa-99c1-3477002be25a&user_locale=pt&youths=0")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=Madrid%2C%20Espanha&index=0&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption="));

        cityList.add(new City("Barcelona", 660, 1013, 60, 26)
                .addTransport(Transport.BUS, 117.00d).addTransport(Transport.CAR, 128.72d)
                .addCommonSources("https://www.trivago.pt/?aDateRange%5Barr%5D=2019-04-22&aDateRange%5Bdep%5D=2019-04-23&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=13437%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0",
                        "https://www.tripadvisor.pt/Restaurants-g187497-Barcelona_Catalonia.html")
                .addRouteMap(Transport.BUS, "https://www.omio.pt/search-frontend/results/1300913440/bus?locale=pt&abTestParameters=&adults=1&arrival_fk=378655&children=0&departure_date=05/04/2019&departure_fk=398743&infants=0&is_rebrand=true&passengerAges=%5Bobject+Object%5D&travel_mode=train&user_currency=EUR&user_domain=pt&user_id=905cb95c-a692-45aa-99c1-3477002be25a&user_locale=pt&youths=0")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=Barcelona%2C%20Espanha&arrivalId=31M3JyYjEwY05ERXVNemczT1RJPWNNaTR4TmprNU1nPT0=&index=1&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption="));

        cityList.add(new City("Paris", 1172, 1525, 120, 26)
                .addTransport(Transport.BUS, 91.00d).addTransport(Transport.CAR, 147.24d)
                .addCommonSources("https://www.trivago.pt/?aDateRange%5Barr%5D=2019-04-22&aDateRange%5Bdep%5D=2019-04-23&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=22235%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0",
                        "https://www.tripadvisor.pt/Restaurants-g187147-Paris_Ile_de_France.html")
                .addRouteMap(Transport.BUS, "https://www.omio.pt/search-frontend/results/1300914955/flight?locale=pt&abTestParameters=&adults=1&arrival_fk=378655&children=0&departure_date=05/04/2019&departure_fk=398743&infants=0&is_rebrand=true&passengerAges=%5Bobject+Object%5D&travel_mode=train&user_currency=EUR&user_domain=pt&user_id=905cb95c-a692-45aa-99c1-3477002be25a&user_locale=pt&youths=0")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=75000%20Paris%2C%20Fran%C3%A7a&index=0&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption="));

        cityList.add(new City("Amsterdam", 1440, 2043, 80, 21)
                .addTransport(Transport.BUS, 100.00d).addTransport(Transport.CAR, 215.71d)
                .addCommonSources("https://www.trivago.pt/?aDateRange%5Barr%5D=2019-04-22&aDateRange%5Bdep%5D=2019-04-23&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=27561%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0",
                        "https://www.tripadvisor.pt/Restaurants-g188590-Amsterdam_North_Holland_Province.html")
                .addRouteMap(Transport.BUS, "https://www.omio.pt/search-frontend/results/1300914221/bus?locale=pt&abTestParameters=&adults=1&arrival_fk=378655&children=0&departure_date=05/04/2019&departure_fk=398743&infants=0&is_rebrand=true&passengerAges=%5Bobject+Object%5D&travel_mode=train&user_currency=EUR&user_domain=pt&user_id=905cb95c-a692-45aa-99c1-3477002be25a&user_locale=pt&youths=0")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=Amsterdam%20(Amesterd%C3%A3o)%2C%20Pa%C3%ADses%20Baixos&index=0&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption="));

        cityList.add(new City("Berlin", 1680, 2515, 40, 25)
                .addTransport(Transport.BUS, 130.00d).addTransport(Transport.CAR, 257.78)
                .addCommonSources("https://www.trivago.pt/?aDateRange%5Barr%5D=2019-04-22&aDateRange%5Bdep%5D=2019-04-23&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=3848%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0",
                        "https://www.tripadvisor.pt/Restaurants-g187323-Berlin.html")
                .addRouteMap(Transport.BUS, "https://www.omio.pt/search-frontend/results/1300916101/bus?locale=pt&abTestParameters=&adults=1&arrival_fk=378655&children=0&departure_date=05/04/2019&departure_fk=398743&infants=0&is_rebrand=true&passengerAges=%5Bobject+Object%5D&travel_mode=train&user_currency=EUR&user_domain=pt&user_id=905cb95c-a692-45aa-99c1-3477002be25a&user_locale=pt&youths=0")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=Berlin%20(Berlim)%2C%20Alemanha&index=0&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption="));

        cityList.add(new City("London", 1440, 1920, 70, 28)
                .addTransport(Transport.BUS, 147.00d).addTransport(Transport.CAR, 246.52d)
                .addCommonSources("https://www.trivago.pt/?aDateRange%5Barr%5D=2019-04-22&aDateRange%5Bdep%5D=2019-04-23&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=17399%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0",
                        "https://www.tripadvisor.pt/Restaurants-g186338-London_England.html")
                .addRouteMap(Transport.BUS, "https://www.omio.pt/search-frontend/results/1300916723/bus?locale=pt&abTestParameters=&adults=1&arrival_fk=378655&children=0&departure_date=05/04/2019&departure_fk=398743&infants=0&is_rebrand=true&passengerAges=%5Bobject+Object%5D&travel_mode=train&user_currency=EUR&user_domain=pt&user_id=905cb95c-a692-45aa-99c1-3477002be25a&user_locale=pt&youths=0")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=London%20(Londres)%2C%20Reino%20Unido&index=0&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption="));
    }

    public List<City> getCityList() {
        return cityList;
    }

    public City getFurthestCity(int budget, Transport transport) {
        City choosenCity = null;

        for (City city : cityList) {

            if (choosenCity == null) {
                choosenCity = city;
            }

            // price is bigger than the required
            if (city.getCostByTransport(transport) > budget) {
                continue;
            }

            // city has worst range for the money
            if (city.getDistance() < choosenCity.getDistance()) {
                continue;
            }

            choosenCity = city;
        }
        return choosenCity;
    }

    public City getCityName(String cityName) {
        for (City city : cityList) {
            if (city.getName().equalsIgnoreCase(cityName)) {
                return city;
            }
        }
        return null;
    }

    public City getCityPrice(int price) {
        return null;
    }
}
