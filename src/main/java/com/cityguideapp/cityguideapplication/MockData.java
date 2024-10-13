package com.cityguideapp.cityguideapplication;

import classes.*;
import types.TransportationType;

import java.util.ArrayList;
import java.util.List;

public class MockData {
    public static List<City> initializeCities() {
        List<City> cities = new ArrayList<>();

        City newYork = new City("New York", "The city that never sleeps, famous for its skyline, culture, and finance.");

        ArrayList<Transportation> newYorkHotelTransport = new ArrayList<>();
        newYorkHotelTransport.add(new Transportation(TransportationType.TAXI, 40));
        newYorkHotelTransport.add(new Transportation(TransportationType.SUBWAY, 30));
        List<String> hotelAmenities = List.of("Free Wi-Fi", "Pool", "Gym");
        newYork.addPlace(new Hotel("Hotel Plaza", newYorkHotelTransport, hotelAmenities));

        ArrayList<Transportation> newYorkHotelTransport2 = new ArrayList<>();
        newYorkHotelTransport2.add(new Transportation(TransportationType.TAXI, 20));
        newYorkHotelTransport2.add(new Transportation(TransportationType.SUBWAY, 27));
        List<String> hotelAmenities2 = List.of("Free Wi-Fi", "Pool", "Gym", "Room service", "Parking");
        newYork.addPlace(new Hotel("Ritz-Carlton", newYorkHotelTransport2,hotelAmenities2));

        ArrayList<Transportation> newYorkHotelTransport3 = new ArrayList<>();
        newYorkHotelTransport3.add(new Transportation(TransportationType.TAXI, 40));
        newYorkHotelTransport3.add(new Transportation(TransportationType.SUBWAY, 30));
        List<String> hotelAmenities3 = List.of("Free Wi-Fi", "Air Conditioning", "Spa Services", "Gym");
        newYork.addPlace(new Hotel("The Langham", newYorkHotelTransport3,hotelAmenities3));


        ArrayList<Transportation> newYorkMallTransport = new ArrayList<>();
        newYorkMallTransport.add(new Transportation(TransportationType.SUBWAY, 30));
        newYorkMallTransport.add(new Transportation(TransportationType.WALKING, 15));
        newYork.addPlace(new Mall("Times Square Mall", newYorkMallTransport,"10:00 AM - 10:00 PM"));

        ArrayList<Transportation> newYorkMallTransport2 = new ArrayList<>();
        newYorkMallTransport2.add(new Transportation(TransportationType.SUBWAY, 30));
        newYorkMallTransport2.add(new Transportation(TransportationType.WALKING, 25));
        newYork.addPlace(new Mall("Brookfield Place", newYorkMallTransport2,"10:00 AM - 10:00 PM"));

        ArrayList<Transportation> newYorkMallTransport3 = new ArrayList<>();
        newYorkMallTransport3.add(new Transportation(TransportationType.SUBWAY, 30));
        newYorkMallTransport3.add(new Transportation(TransportationType.WALKING, 45));
        newYork.addPlace(new Mall("Westfield World Trade Center", newYorkMallTransport3,"10:00 AM - 10:00 PM"));


        ArrayList<Transportation> newYorkRestaurantTransport = new ArrayList<>();
        newYorkRestaurantTransport.add(new Transportation(TransportationType.WALKING, 15));
        newYork.addPlace(new Restaurant("Joe's Pizza", newYorkRestaurantTransport,"10:00 AM - 10:00 PM"));

        ArrayList<Transportation> newYorkRestaurantTransport2 = new ArrayList<>();
        newYorkRestaurantTransport2.add(new Transportation(TransportationType.WALKING, 45));
        newYork.addPlace(new Restaurant("Le Bernardin", newYorkRestaurantTransport2,"10:00 AM - 11:00 PM"));

        ArrayList<Transportation> newYorkRestaurantTransport3 = new ArrayList<>();
        newYorkRestaurantTransport3.add(new Transportation(TransportationType.WALKING, 40));
        newYork.addPlace(new Restaurant("Peter Luger Steak House", newYorkRestaurantTransport3,"10:00 AM - 12:00 PM"));


        ArrayList<Transportation> newYorkTouristTransport = new ArrayList<>();
        newYorkTouristTransport.add(new Transportation(TransportationType.SUBWAY, 28));
        newYork.addPlace(new TouristPlace("Statue of Liberty", newYorkTouristTransport,"Full Time"));

        ArrayList<Transportation> newYorkTouristTransport2 = new ArrayList<>();
        newYorkTouristTransport2.add(new Transportation(TransportationType.BUS, 50));
        newYork.addPlace(new TouristPlace("Times Square",  newYorkTouristTransport2,"Full Time"));

        ArrayList<Transportation> newYorkTouristTransport3 = new ArrayList<>();
        newYorkTouristTransport3.add(new Transportation(TransportationType.SUBWAY, 40));
        newYork.addPlace(new TouristPlace("Central Park", newYorkTouristTransport3,"Full Time"));

        cities.add(newYork);


        City tokyo = new City("Tokyo", "A bustling metropolis blending tradition with modernity, famous for its technology.");

        ArrayList<Transportation> tokyoHotelTransport = new ArrayList<>();
        tokyoHotelTransport.add(new Transportation(TransportationType.TAXI, 50));
        tokyoHotelTransport.add(new Transportation(TransportationType.SUBWAY, 30));
        List<String> hotelAmenities4 = List.of("Free Wi-Fi", "Laundry Service", "Parking");
        tokyo.addPlace(new Hotel("Shibuya Excel Hotel", tokyoHotelTransport, hotelAmenities4));

        ArrayList<Transportation> tokyoHotelTransport2 = new ArrayList<>();
        tokyoHotelTransport2.add(new Transportation(TransportationType.TAXI, 55));
        tokyoHotelTransport2.add(new Transportation(TransportationType.SUBWAY, 40));
        List<String> hotelAmenities5 = List.of("Free Wi-Fi", "Laundry Service", "Parking", "Lounge");
        tokyo.addPlace(new Hotel("Park Hyatt", tokyoHotelTransport2,hotelAmenities5));

        ArrayList<Transportation> tokyoHotelTransport3 = new ArrayList<>();
        tokyoHotelTransport3.add(new Transportation(TransportationType.TAXI, 30));
        tokyoHotelTransport3.add(new Transportation(TransportationType.SUBWAY, 35));
        List<String> hotelAmenities6 = List.of("Free Wi-Fi", "Laundry Service", "Room Service");
        tokyo.addPlace(new Hotel("Aman Tokyo", tokyoHotelTransport3 ,hotelAmenities6));


        ArrayList<Transportation> tokyoMallTransport = new ArrayList<>();
        tokyoMallTransport.add(new Transportation(TransportationType.SUBWAY, 45));
        tokyo.addPlace(new Mall("Roppongi Hills", tokyoMallTransport,"10:00 AM - 10:00 PM"));

        ArrayList<Transportation> tokyoMallTransport2 = new ArrayList<>();
        tokyoMallTransport2.add(new Transportation(TransportationType.SUBWAY, 35));
        tokyo.addPlace(new Mall("Ginza Six", tokyoMallTransport2,"10:00 AM - 10:00 PM"));

        ArrayList<Transportation> tokyoMallTransport3 = new ArrayList<>();
        tokyoMallTransport3.add(new Transportation(TransportationType.SUBWAY, 55));
        tokyo.addPlace(new Mall("Tokyo Midtown", tokyoMallTransport3,"10:00 AM - 10:00 PM"));

        ArrayList<Transportation> tokyoRestaurantTransport = new ArrayList<>();
        tokyoRestaurantTransport.add(new Transportation(TransportationType.WALKING, 10));
        tokyo.addPlace(new Restaurant("Sushi Dai", tokyoRestaurantTransport,"8:00 AM - 8:00 PM"));

        ArrayList<Transportation> tokyoRestaurantTransport2 = new ArrayList<>();
        tokyoRestaurantTransport2.add(new Transportation(TransportationType.WALKING, 30));
        tokyo.addPlace(new Restaurant("Sukiyabashi Jiroi", tokyoRestaurantTransport2,"10:00 AM - 9:00 PM"));

        ArrayList<Transportation> tokyoRestaurantTransport3 = new ArrayList<>();
        tokyoRestaurantTransport3.add(new Transportation(TransportationType.WALKING, 55));
        tokyo.addPlace(new Restaurant("Narisawa", tokyoRestaurantTransport3,"10:00 AM - 11:00 PM"));

        ArrayList<Transportation> tokyoTouristTransport = new ArrayList<>();
        tokyoTouristTransport.add(new Transportation(TransportationType.SUBWAY, 25));
        tokyo.addPlace(new TouristPlace("The Imperial Palace", tokyoTouristTransport,"10:00 AM - 15:00 PM"));

        ArrayList<Transportation> tokyoTouristTransport2 = new ArrayList<>();
        tokyoTouristTransport2.add(new Transportation(TransportationType.SUBWAY, 20));
        tokyo.addPlace(new TouristPlace("Tokyo Tower", tokyoTouristTransport2,"10:00 AM - 17:00 PM"));

        ArrayList<Transportation> tokyoTouristTransport3 = new ArrayList<>();
        tokyoTouristTransport3.add(new Transportation(TransportationType.WALKING, 40));
        tokyo.addPlace(new TouristPlace("Shibuya Crossing", tokyoTouristTransport3,"10:00 AM - 18:00 PM"));

        cities.add(tokyo);


        City london = new City("London", "A vibrant city known for its rich history, diverse culture, and iconic landmarks.");

        ArrayList<Transportation> londonHotelTransport = new ArrayList<>();
        londonHotelTransport.add(new Transportation(TransportationType.TAXI, 20));
        londonHotelTransport.add(new Transportation(TransportationType.SUBWAY, 30));
        List<String> hotelAmenities7 = List.of("Free Wi-Fi", "Laundry Service", "Parking", "Room Service");
        london.addPlace(new Hotel("The Savoy Hotel", londonHotelTransport,hotelAmenities7));

        ArrayList<Transportation> londonHotelTransport2 = new ArrayList<>();
        londonHotelTransport2.add(new Transportation(TransportationType.TAXI, 40));
        londonHotelTransport2.add(new Transportation(TransportationType.SUBWAY, 50));
        List<String> hotelAmenities8 = List.of("Free Wi-Fi", "Pool", "Parking", "Room Service");
        london.addPlace(new Hotel("Claridge's", londonHotelTransport2,hotelAmenities8));

        ArrayList<Transportation> londonHotelTransport3 = new ArrayList<>();
        londonHotelTransport3.add(new Transportation(TransportationType.TAXI, 30));
        londonHotelTransport3.add(new Transportation(TransportationType.SUBWAY, 40));
        List<String> hotelAmenities9 = List.of("Free Wi-Fi", "Laundry Service", "Parking", "Room Service");
        london.addPlace(new Hotel("The Langham London", londonHotelTransport3, hotelAmenities9 ));

        ArrayList<Transportation> londonHotelTransport4 = new ArrayList<>();
        londonHotelTransport4.add(new Transportation(TransportationType.TAXI, 20));
        londonHotelTransport4.add(new Transportation(TransportationType.SUBWAY, 50));
        List<String> hotelAmenities10 = List.of("Free Wi-Fi", "Pool", "Parking", "Room Service");
        london.addPlace(new Hotel("The Connaught", londonHotelTransport4,hotelAmenities10));

        ArrayList<Transportation> londonMallTransport = new ArrayList<>();
        londonMallTransport.add(new Transportation(TransportationType.SUBWAY, 15));
        londonMallTransport.add(new Transportation(TransportationType.WALKING, 28));
        london.addPlace(new Mall("Westfield London", londonMallTransport,"12:00 AM - 10:00 PM"));

        ArrayList<Transportation> londonMallTransport2 = new ArrayList<>();
        londonMallTransport2.add(new Transportation(TransportationType.SUBWAY, 15));
        londonMallTransport2.add(new Transportation(TransportationType.WALKING, 45));
        london.addPlace(new Mall("Covent Garden Market", londonMallTransport2,"8:00 AM - 11:00 PM"));

        ArrayList<Transportation> londonMallTransport3 = new ArrayList<>();
        londonMallTransport3.add(new Transportation(TransportationType.SUBWAY, 30));
        londonMallTransport3.add(new Transportation(TransportationType.WALKING, 48));
        london.addPlace(new Mall("Harrods", londonMallTransport3,"12:00 AM - 12:00 PM"));

        ArrayList<Transportation> londonRestaurantTransport = new ArrayList<>();
        londonRestaurantTransport.add(new Transportation(TransportationType.BUS, 34));
        london.addPlace(new Restaurant("Dishoom", londonRestaurantTransport,"10:00 AM - 10:00 PM"));

        ArrayList<Transportation> londonRestaurantTransport2 = new ArrayList<>();
        londonRestaurantTransport2.add(new Transportation(TransportationType.WALKING, 40));
        london.addPlace(new Restaurant("The Ledbury", londonRestaurantTransport2,"10:00 AM - 12:00 PM"));

        ArrayList<Transportation> londonRestaurantTransport3 = new ArrayList<>();
        londonRestaurantTransport3.add(new Transportation(TransportationType.WALKING, 55));
        london.addPlace(new Restaurant("Gordon Ramsay's TouristPlace", londonRestaurantTransport3,"11:00 AM - 9:00 PM"));

        ArrayList<Transportation> londonTouristTransport = new ArrayList<>();
        londonTouristTransport.add(new Transportation(TransportationType.SUBWAY, 20));
        london.addPlace(new TouristPlace("The Tower of London", londonTouristTransport,"10:00 AM - 16:00 PM"));

        ArrayList<Transportation> londonTouristTransport2 = new ArrayList<>();
        londonTouristTransport2.add(new Transportation(TransportationType.BUS, 40));
        london.addPlace(new TouristPlace("The British Museum", londonTouristTransport2,"10:00 AM - 15:00 PM"));

        ArrayList<Transportation> londonTouristTransport3 = new ArrayList<>();
        londonTouristTransport3.add(new Transportation(TransportationType.WALKING, 60));
        london.addPlace(new TouristPlace("Buckingham Palace", londonTouristTransport3,"10:00 AM - 14:00 PM"));

        cities.add(london);

        return cities;
    }
}
