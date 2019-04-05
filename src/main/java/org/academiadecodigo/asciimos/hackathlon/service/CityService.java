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

        cityList.add(new City("Fundão", 0, 13, 5, 12)
                .addTransport(Transport.BUS, 0.00d).addTransport(Transport.CAR, 0.00d)
                .addCommonSources("https://www.trivago.pt/fundao-73451/hotel", "https://www.tripadvisor.pt/Restaurants-g608950-Fundao_Castelo_Branco_District_Central_Portugal.html")
                .addRouteMap(Transport.BUS, "").addRouteMap(Transport.CAR, "")
                .addTimeMap(Transport.BUS, 0).addTimeMap(Transport.CAR, 0));

        cityList.add(new City("Covilhã", 18, 12, 20, 16)
                .addTransport(Transport.BUS, 6.00d).addTransport(Transport.CAR, 2.33d)
                .addCommonSources("https://www.trivago.pt/?aDateRange%5Barr%5D=2019-04-23&aDateRange%5Bdep%5D=2019-04-24&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=31801%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0",
                        "https://www.tripadvisor.pt/Restaurants-g189145-Covilha_Castelo_Branco_District_Central_Portugal.html")
                .addRouteMap(Transport.BUS, "https://www.oautocarro.pt/pt/autocarro-fundao-castelo-branco-pt-x-covilha-castelo-branco-pt").addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=6200%20Covilh%C3%A3%2C%20Portugal&index=0&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption=")
                .addTimeMap(Transport.BUS, 25).addTimeMap(Transport.CAR, 20));

        cityList.add(new City("Porto",200, 13, 45, 22)
                .addTransport(Transport.BUS, 17.90d).addTransport(Transport.CAR, 34.74d)
                .addCommonSources("https://www.trivago.pt/?aDateRange%5Barr%5D=2019-04-22&aDateRange%5Bdep%5D=2019-04-23&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=31823%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0",
                        "https://www.tripadvisor.pt/Restaurants-g189180-Porto_Porto_District_Northern_Portugal.html")
                .addRouteMap(Transport.BUS, "https://www.rede-expressos.pt/tickets?destination=100&source=303")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=Porto%2C%20Portugal&arrivalId=31NDF4dnIxMGNOREV1TVRVd05UVT1jTFRndU5qRXdNdz09&index=1&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption=")
                .addTimeMap(Transport.BUS, 230).addTimeMap(Transport.CAR, 244));

        cityList.add(new City("Madrid", 396, 11,60, 24)
                .addTransport(Transport.BUS, 38.00d).addTransport(Transport.CAR, 38.02d)
                .addCommonSources("https://www.trivago.pt/?aDateRange%5Barr%5D=2019-04-22&aDateRange%5Bdep%5D=2019-04-23&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=13628%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0",
                        "https://www.tripadvisor.pt/Restaurants-g187514-Madrid.html")
                .addRouteMap(Transport.BUS, "https://www.omio.pt/search-frontend/results/1300912268/bus?locale=pt&abTestParameters=&adults=1&arrival_fk=378655&children=0&departure_date=05/04/2019&departure_fk=398743&infants=0&is_rebrand=true&passengerAges=%5Bobject+Object%5D&travel_mode=train&user_currency=EUR&user_domain=pt&user_id=905cb95c-a692-45aa-99c1-3477002be25a&user_locale=pt&youths=0")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=Madrid%2C%20Espanha&index=0&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption=")
                .addTimeMap(Transport.BUS, 540).addTimeMap(Transport.CAR, 285));

        cityList.add(new City("Barcelona", 1013, 13, 60, 26)
                .addTransport(Transport.BUS, 117.00d).addTransport(Transport.CAR, 128.72d)
                .addCommonSources("https://www.trivago.pt/?aDateRange%5Barr%5D=2019-04-22&aDateRange%5Bdep%5D=2019-04-23&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=13437%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0",
                        "https://www.tripadvisor.pt/Restaurants-g187497-Barcelona_Catalonia.html")
                .addRouteMap(Transport.BUS, "https://www.omio.pt/search-frontend/results/1300913440/bus?locale=pt&abTestParameters=&adults=1&arrival_fk=378655&children=0&departure_date=05/04/2019&departure_fk=398743&infants=0&is_rebrand=true&passengerAges=%5Bobject+Object%5D&travel_mode=train&user_currency=EUR&user_domain=pt&user_id=905cb95c-a692-45aa-99c1-3477002be25a&user_locale=pt&youths=0")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=Barcelona%2C%20Espanha&arrivalId=31M3JyYjEwY05ERXVNemczT1RJPWNNaTR4TmprNU1nPT0=&index=1&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption=")
                .addTimeMap(Transport.BUS, 1500).addTimeMap(Transport.CAR, 660));

        cityList.add(new City("Paris", 1525, 11, 120, 26)
                .addTransport(Transport.BUS, 91.00d).addTransport(Transport.CAR, 147.24d)
                .addCommonSources("https://www.trivago.pt/?aDateRange%5Barr%5D=2019-04-22&aDateRange%5Bdep%5D=2019-04-23&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=22235%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0",
                        "https://www.tripadvisor.pt/Restaurants-g187147-Paris_Ile_de_France.html")
                .addRouteMap(Transport.BUS, "https://www.omio.pt/search-frontend/results/1300914955/flight?locale=pt&abTestParameters=&adults=1&arrival_fk=378655&children=0&departure_date=05/04/2019&departure_fk=398743&infants=0&is_rebrand=true&passengerAges=%5Bobject+Object%5D&travel_mode=train&user_currency=EUR&user_domain=pt&user_id=905cb95c-a692-45aa-99c1-3477002be25a&user_locale=pt&youths=0")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=75000%20Paris%2C%20Fran%C3%A7a&index=0&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption=")
                .addTimeMap(Transport.BUS, 1200).addTimeMap(Transport.CAR, 1172));

        cityList.add(new City("Amsterdam", 2043, 8, 80, 21)
                .addTransport(Transport.BUS, 100.00d).addTransport(Transport.CAR, 215.71d)
                .addCommonSources("https://www.trivago.pt/?aDateRange%5Barr%5D=2019-04-22&aDateRange%5Bdep%5D=2019-04-23&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=27561%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0",
                        "https://www.tripadvisor.pt/Restaurants-g188590-Amsterdam_North_Holland_Province.html")
                .addRouteMap(Transport.BUS, "https://www.omio.pt/search-frontend/results/1300914221/bus?locale=pt&abTestParameters=&adults=1&arrival_fk=378655&children=0&departure_date=05/04/2019&departure_fk=398743&infants=0&is_rebrand=true&passengerAges=%5Bobject+Object%5D&travel_mode=train&user_currency=EUR&user_domain=pt&user_id=905cb95c-a692-45aa-99c1-3477002be25a&user_locale=pt&youths=0")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=Amsterdam%20(Amesterd%C3%A3o)%2C%20Pa%C3%ADses%20Baixos&index=0&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption=")
                .addTimeMap(Transport.BUS, 1710).addTimeMap(Transport.CAR, 1440));

        cityList.add(new City("Berlin", 2515, 9, 40, 25)
                .addTransport(Transport.BUS, 130.00d).addTransport(Transport.CAR, 257.78)
                .addCommonSources("https://www.trivago.pt/?aDateRange%5Barr%5D=2019-04-22&aDateRange%5Bdep%5D=2019-04-23&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=3848%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0",
                        "https://www.tripadvisor.pt/Restaurants-g187323-Berlin.html")
                .addRouteMap(Transport.BUS, "https://www.omio.pt/search-frontend/results/1300916101/bus?locale=pt&abTestParameters=&adults=1&arrival_fk=378655&children=0&departure_date=05/04/2019&departure_fk=398743&infants=0&is_rebrand=true&passengerAges=%5Bobject+Object%5D&travel_mode=train&user_currency=EUR&user_domain=pt&user_id=905cb95c-a692-45aa-99c1-3477002be25a&user_locale=pt&youths=0")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=Berlin%20(Berlim)%2C%20Alemanha&index=0&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption=")
                .addTimeMap(Transport.BUS, 2445).addTimeMap(Transport.CAR, 1680));

        cityList.add(new City("London",1920, 11,70, 28)
                .addTransport(Transport.BUS, 147.00d).addTransport(Transport.CAR, 246.52d)
                .addCommonSources("https://www.trivago.pt/?aDateRange%5Barr%5D=2019-04-22&aDateRange%5Bdep%5D=2019-04-23&aPriceRange%5Bfrom%5D=0&aPriceRange%5Bto%5D=0&iRoomType=7&aRooms%5B0%5D%5Badults%5D=2&cpt2=17399%2F200&iViewType=0&bIsSeoPage=0&sortingId=1&slideoutsPageItemId=&iGeoDistanceLimit=20000&address=&addressGeoCode=&offset=0",
                        "https://www.tripadvisor.pt/Restaurants-g186338-London_England.html")
                .addRouteMap(Transport.BUS, "https://www.omio.pt/search-frontend/results/1300916723/bus?locale=pt&abTestParameters=&adults=1&arrival_fk=378655&children=0&departure_date=05/04/2019&departure_fk=398743&infants=0&is_rebrand=true&passengerAges=%5Bobject+Object%5D&travel_mode=train&user_currency=EUR&user_domain=pt&user_id=905cb95c-a692-45aa-99c1-3477002be25a&user_locale=pt&youths=0")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=London%20(Londres)%2C%20Reino%20Unido&index=0&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption=")
                .addTimeMap(Transport.BUS, 1740).addTimeMap(Transport.CAR, 1440));

        cityList.add(new City("Brussels",1897, 9, 70, 30 )
                .addTransport(Transport.BUS, 96.00d).addTransport(Transport.CAR, 449.28d)
                .addCommonSources("https://www.trivago.pt/?themeId=718&iPathId=44371&sem_keyword=trivago%20bruxelas&sem_creativeid=274058278205&sem_matchtype=e&sem_network=g&sem_device=c&sem_placement=&sem_target=&sem_adposition=1t1&sem_param1=&sem_param2=&sem_campaignid=706516027&sem_adgroupid=37048228215&sem_targetid=aud-83021163157%3Akwd-86361355302&sem_location=20868&cip=3511900005&gclid=Cj0KCQjw1pblBRDSARIsACfUG10OSWEWpBLS90k5rYCpnGkjIYVidA2Yzx7oAs1xvs_Nzj1N9Hi7soEaApi5EALw_wcB",
                        "https://www.tripadvisor.pt/SmartDeals-g188644-Brussels-Hotel-Deals.html")
                .addRouteMap(Transport.BUS, "https://www.omio.com/search-frontend/results/1359517559/bus?locale=en&abTestParameters=&adults=1&arrival_fk=369233&children=0&departure_date=06/04/2019&departure_fk=398743&easy=1&infants=0&is_rebrand=true&passengerAges=%5Bobject+Object%5D&travel_mode=train&user_currency=EUR&user_domain=com&user_id=fab74843-591e-4618-b9a2-8765f83639a8&user_locale=en&youths=0&def_sort=s")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=Bruxelles%20(Bruxelas)%2C%20B%C3%A9lgica&index=0&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption=")
                .addTimeMap(Transport.BUS,1500).addTimeMap(Transport.CAR, 1105));

        cityList.add(new City("Bordeaux",899, 13, 55, 25)
                .addTransport(Transport.BUS, 59.00d).addTransport(Transport.CAR, 190.10d)
                .addCommonSources("https://www.trivago.pt/bordeus-35213/hotel",
                        "https://www.tripadvisor.pt/Restaurants-g187079-Bordeaux_Gironde_Nouvelle_Aquitaine.html")
                .addRouteMap(Transport.BUS, "https://www.omio.com/search-frontend/results/1359517657/bus?locale=en&abTestParameters=&adults=1&arrival_fk=369233&children=0&departure_date=06/04/2019&departure_fk=398743&easy=1&infants=0&is_rebrand=true&passengerAges=%5Bobject+Object%5D&travel_mode=train&user_currency=EUR&user_domain=com&user_id=fab74843-591e-4618-b9a2-8765f83639a8&user_locale=en&youths=0&def_sort=s")
                .addRouteMap(Transport.CAR, "https://www.viamichelin.pt/web/Itinerarios?departure=Lugar%20atual&departureGps=true&arrival=33000%20Bordeaux%20(33000%20Bord%C3%A9us)%2C%20Fran%C3%A7a&index=0&vehicle=0&type=0&distance=km&currency=EUR&highway=false&toll=false&vignette=false&orc=false&crossing=true&caravan=false&shouldUseTraffic=false&withBreaks=false&break_frequency=7200&coffee_duration=1200&lunch_duration=3600&diner_duration=3600&night_duration=32400&car=hatchback&fuel=petrol&fuelCost=1.534&allowance=0&corridor=&departureDate=&arrivalDate=&fuelConsumption=")
                .addTimeMap(Transport.BUS,720).addTimeMap(Transport.CAR, 554));
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
