package models;

import types.TransportationType;

import java.util.ArrayList;
import java.util.List;

public class MockData {
    public static List<City> initializeCities() {
        List<City> cities = new ArrayList<>();

        City newYork = new City("New York", "The city that never sleeps, famous for its skyline, culture, and finance.From the towering Empire State Building to the majestic Statue of Liberty, the city is a treasure trove of landmarks and attractions. Explore Central Park, a sprawling oasis amidst the urban hustle, or immerse yourself in the vibrant arts scene of Broadway and the Museum Mile.");

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
        newYork.addPlace(new TouristPlace("Statue of Liberty", newYorkTouristTransport,"All Day"));

        ArrayList<Transportation> newYorkTouristTransport2 = new ArrayList<>();
        newYorkTouristTransport2.add(new Transportation(TransportationType.BUS, 50));
        newYork.addPlace(new TouristPlace("Times Square",  newYorkTouristTransport2,"All Day"));

        ArrayList<Transportation> newYorkTouristTransport3 = new ArrayList<>();
        newYorkTouristTransport3.add(new Transportation(TransportationType.SUBWAY, 40));
        newYork.addPlace(new TouristPlace("Central Park", newYorkTouristTransport3,"All Day"));

        cities.add(newYork);


        City tokyo = new City("Tokyo", "A bustling metropolis blending tradition with modernity, famous for its technology.Discover the historic temples of Asakusa, shop for the latest fashion in Harajuku, or savor authentic sushi at the Tsukiji Outer Market. Tokyo's diverse districts, such as Akihabara for electronics and Shinjuku for nightlife, offer endless exploration opportunities. ");

        ArrayList<Transportation> tokyoHotelTransport = new ArrayList<>();
        tokyoHotelTransport.add(new Transportation(TransportationType.TAXI, 50));
        tokyoHotelTransport.add(new Transportation(TransportationType.SUBWAY, 30));
        List<String> hotelAmenities4 = List.of("Free Wi-Fi", "Laundry Service", "Parking");
        tokyo.addPlace(new Hotel("Shibuya Excel Hotel", tokyoHotelTransport, hotelAmenities4,"24/7"));

        ArrayList<Transportation> tokyoHotelTransport2 = new ArrayList<>();
        tokyoHotelTransport2.add(new Transportation(TransportationType.TAXI, 55));
        tokyoHotelTransport2.add(new Transportation(TransportationType.SUBWAY, 40));
        List<String> hotelAmenities5 = List.of("Free Wi-Fi", "Laundry Service", "Parking", "Lounge");
        tokyo.addPlace(new Hotel("Park Hyatt", tokyoHotelTransport2,hotelAmenities5,"24/7"));

        ArrayList<Transportation> tokyoHotelTransport3 = new ArrayList<>();
        tokyoHotelTransport3.add(new Transportation(TransportationType.TAXI, 30));
        tokyoHotelTransport3.add(new Transportation(TransportationType.SUBWAY, 35));
        List<String> hotelAmenities6 = List.of("Free Wi-Fi", "Laundry Service", "Room Service");
        tokyo.addPlace(new Hotel("Aman Tokyo", tokyoHotelTransport3 ,hotelAmenities6,"24/7"));


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


        City london = new City("London", "A vibrant city known for its rich history, diverse culture, and iconic landmarks.From the iconic Big Ben and the historic Tower of London to the stunning British Museum, there's no shortage of attractions to explore. The city's diverse neighborhoods, such as Camden, Shoreditch, and Notting Hill, offer a mix of trendy boutiques, lively markets, and world-class dining.");

        ArrayList<Transportation> londonHotelTransport = new ArrayList<>();
        londonHotelTransport.add(new Transportation(TransportationType.TAXI, 20));
        londonHotelTransport.add(new Transportation(TransportationType.SUBWAY, 30));
        List<String> hotelAmenities7 = List.of("Free Wi-Fi", "Laundry Service", "Parking", "Room Service");
        london.addPlace(new Hotel("The Savoy Hotel", londonHotelTransport,hotelAmenities7,"24/7"));

        ArrayList<Transportation> londonHotelTransport2 = new ArrayList<>();
        londonHotelTransport2.add(new Transportation(TransportationType.TAXI, 40));
        londonHotelTransport2.add(new Transportation(TransportationType.SUBWAY, 50));
        List<String> hotelAmenities8 = List.of("Free Wi-Fi", "Pool", "Parking", "Room Service");
        london.addPlace(new Hotel("Claridge's", londonHotelTransport2,hotelAmenities8,"24/7"));

        ArrayList<Transportation> londonHotelTransport3 = new ArrayList<>();
        londonHotelTransport3.add(new Transportation(TransportationType.TAXI, 30));
        londonHotelTransport3.add(new Transportation(TransportationType.SUBWAY, 40));
        List<String> hotelAmenities9 = List.of("Free Wi-Fi", "Laundry Service", "Parking", "Room Service");
        london.addPlace(new Hotel("The Langham London", londonHotelTransport3, hotelAmenities9,"24/7" ));


        ArrayList<Transportation> londonHotelTransport4 = new ArrayList<>();
        londonHotelTransport4.add(new Transportation(TransportationType.TAXI, 20));
        londonHotelTransport4.add(new Transportation(TransportationType.SUBWAY, 50));
        List<String> hotelAmenities10 = List.of("Free Wi-Fi", "Pool", "Parking", "Room Service");
        london.addPlace(new Hotel("The Connaught", londonHotelTransport4,hotelAmenities10,"10:00 AM - 10:00 PM"));

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


        City paris = new City("Paris", "The romantic capital of France, known for its art, fashion, and iconic landmarks. Explore the Eiffel Tower, the Louvre Museum, and the charming streets of Montmartre. Don't forget to enjoy a café along the Seine.");

        ArrayList<Transportation> parisHotelTransport1 = new ArrayList<>();
        parisHotelTransport1.add(new Transportation(TransportationType.SUBWAY, 15));
        parisHotelTransport1.add(new Transportation(TransportationType.TAXI, 25));
        List<String> parisHotelAmenities1 = List.of("Free Wi-Fi", "Breakfast included", "Pet-friendly");
        paris.addPlace(new Hotel("Hôtel Le Meurice", parisHotelTransport1, parisHotelAmenities1, "24/7"));

        ArrayList<Transportation> parisHotelTransport2 = new ArrayList<>();
        parisHotelTransport2.add(new Transportation(TransportationType.WALKING, 10));
        List<String> parisHotelAmenities2 = List.of("Free Wi-Fi", "Rooftop bar", "Spa services");
        paris.addPlace(new Hotel("Le Meurice", parisHotelTransport2, parisHotelAmenities2, "24/7"));

        ArrayList<Transportation> parisHotelTransport3 = new ArrayList<>();
        parisHotelTransport3.add(new Transportation(TransportationType.SUBWAY, 12));
        List<String> parisHotelAmenities3 = List.of("Free breakfast", "Gym", "24-hour room service");
        paris.addPlace(new Hotel("Hôtel de Crillon", parisHotelTransport3, parisHotelAmenities3, "24/7"));

        ArrayList<Transportation> parisRestaurantTransport1 = new ArrayList<>();
        parisRestaurantTransport1.add(new Transportation(TransportationType.WALKING, 5));
        paris.addPlace(new Restaurant("Le Meurice Alain Ducasse", parisRestaurantTransport1, "12:00 PM - 2:30 PM, 7:00 PM - 10:00 PM"));

        ArrayList<Transportation> parisRestaurantTransport2 = new ArrayList<>();
        parisRestaurantTransport2.add(new Transportation(TransportationType.SUBWAY, 8));
        paris.addPlace(new Restaurant("L'Atelier de Joël Robuchon", parisRestaurantTransport2, "12:00 PM - 2:30 PM, 7:00 PM - 11:00 PM"));

        ArrayList<Transportation> parisRestaurantTransport3 = new ArrayList<>();
        parisRestaurantTransport3.add(new Transportation(TransportationType.WALKING, 10));
        paris.addPlace(new Restaurant("Chez Janou", parisRestaurantTransport3, "12:00 PM - 2:30 PM, 7:00 PM - 10:30 PM"));

        ArrayList<Transportation> parisMallTransport1 = new ArrayList<>();
        parisMallTransport1.add(new Transportation(TransportationType.WALKING, 15));
        paris.addPlace(new Mall("Galeries Lafayette", parisMallTransport1, "9:30 AM - 8:30 PM"));

        ArrayList<Transportation> parisMallTransport2 = new ArrayList<>();
        parisMallTransport2.add(new Transportation(TransportationType.SUBWAY, 10));
        paris.addPlace(new Mall("Le Bon Marché", parisMallTransport2, "10:00 AM - 8:00 PM"));

        ArrayList<Transportation> parisMallTransport3 = new ArrayList<>();
        parisMallTransport3.add(new Transportation(TransportationType.WALKING, 20));
        paris.addPlace(new Mall("BHV Marais", parisMallTransport3, "10:00 AM - 8:00 PM"));

        ArrayList<Transportation> parisTouristTransport1 = new ArrayList<>();
        parisTouristTransport1.add(new Transportation(TransportationType.SUBWAY, 10));
        paris.addPlace(new TouristPlace("Eiffel Tower", parisTouristTransport1, "9:00 AM - 11:00 PM"));

        ArrayList<Transportation> parisTouristTransport2 = new ArrayList<>();
        parisTouristTransport2.add(new Transportation(TransportationType.SUBWAY, 15));
        paris.addPlace(new TouristPlace("Louvre Museum", parisTouristTransport2, "9:00 AM - 6:00 PM"));

        ArrayList<Transportation> parisTouristTransport3 = new ArrayList<>();
        parisTouristTransport3.add(new Transportation(TransportationType.WALKING, 10));
        paris.addPlace(new TouristPlace("Montmartre", parisTouristTransport3, "All Day"));

        cities.add(paris);


        City rome = new City("Rome", "The Eternal City, renowned for its nearly 3,000 years of globally influential art, architecture, and culture. Discover the Colosseum, Vatican City, and the beautiful fountains and piazzas throughout the city.");

        ArrayList<Transportation> romeHotelTransport1 = new ArrayList<>();
        romeHotelTransport1.add(new Transportation(TransportationType.TAXI, 20));
        romeHotelTransport1.add(new Transportation(TransportationType.SUBWAY, 15));
        List<String> romeHotelAmenities1 = List.of("Free Wi-Fi", "Airport Shuttle", "Rooftop Terrace");
        rome.addPlace(new Hotel("Hotel Artemide", romeHotelTransport1, romeHotelAmenities1, "24/7"));

        ArrayList<Transportation> romeHotelTransport2 = new ArrayList<>();
        romeHotelTransport2.add(new Transportation(TransportationType.WALKING, 10));
        List<String> romeHotelAmenities2 = List.of("Free breakfast", "24-hour reception", "Gym");
        rome.addPlace(new Hotel("Hotel Nazionale", romeHotelTransport2, romeHotelAmenities2, "24/7"));

        ArrayList<Transportation> romeHotelTransport3 = new ArrayList<>();
        romeHotelTransport3.add(new Transportation(TransportationType.SUBWAY, 10));
        List<String> romeHotelAmenities3 = List.of("Free Wi-Fi", "Concierge service", "Pool");
        rome.addPlace(new Hotel("H10 Roma Città", romeHotelTransport3, romeHotelAmenities3, "24/7"));

        ArrayList<Transportation> romeRestaurantTransport1 = new ArrayList<>();
        romeRestaurantTransport1.add(new Transportation(TransportationType.WALKING, 10));
        rome.addPlace(new Restaurant("Trattoria Da Enzo", romeRestaurantTransport1, "12:30 PM - 3:30 PM, 7:30 PM - 10:30 PM"));

        ArrayList<Transportation> romeRestaurantTransport2 = new ArrayList<>();
        romeRestaurantTransport2.add(new Transportation(TransportationType.WALKING, 15));
        rome.addPlace(new Restaurant("Ristorante Aroma", romeRestaurantTransport2, "12:00 PM - 3:00 PM, 7:00 PM - 10:30 PM"));

        ArrayList<Transportation> romeRestaurantTransport3 = new ArrayList<>();
        romeRestaurantTransport3.add(new Transportation(TransportationType.WALKING, 5));
        rome.addPlace(new Restaurant("Roscioli", romeRestaurantTransport3, "9:00 AM - 11:00 PM"));

        ArrayList<Transportation> romeMallTransport1 = new ArrayList<>();
        romeMallTransport1.add(new Transportation(TransportationType.SUBWAY, 10));
        rome.addPlace(new Mall("Centro Commerciale Roma Est", romeMallTransport1, "10:00 AM - 10:00 PM"));

        ArrayList<Transportation> romeMallTransport2 = new ArrayList<>();
        romeMallTransport2.add(new Transportation(TransportationType.SUBWAY, 15));
        rome.addPlace(new Mall("Euroma2", romeMallTransport2, "10:00 AM - 10:00 PM"));

        ArrayList<Transportation> romeMallTransport3 = new ArrayList<>();
        romeMallTransport3.add(new Transportation(TransportationType.WALKING, 20));
        rome.addPlace(new Mall("Porta di Roma", romeMallTransport3, "10:00 AM - 10:00 PM"));

        ArrayList<Transportation> romeTouristTransport1 = new ArrayList<>();
        romeTouristTransport1.add(new Transportation(TransportationType.BUS, 10));
        rome.addPlace(new TouristPlace("Colosseum", romeTouristTransport1, "9:00 AM - 7:00 PM"));

        ArrayList<Transportation> romeTouristTransport2 = new ArrayList<>();
        romeTouristTransport2.add(new Transportation(TransportationType.WALKING, 15));
        rome.addPlace(new TouristPlace("Vatican Museums", romeTouristTransport2, "9:00 AM - 6:00 PM"));

        ArrayList<Transportation> romeTouristTransport3 = new ArrayList<>();
        romeTouristTransport3.add(new Transportation(TransportationType.WALKING, 10));
        rome.addPlace(new TouristPlace("Trevi Fountain", romeTouristTransport3, "All Day"));

        cities.add(rome);

        return cities;
    }
}
