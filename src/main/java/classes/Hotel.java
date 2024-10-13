package classes;

import types.PlaceType;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends Place {
    private List<String> amenities;

    public Hotel(String name, List<Transportation> transportationMethods, List<String> amenities) {
        super(name, PlaceType.HOTEL, transportationMethods);
        this.amenities = new ArrayList<>(amenities);
    }


    public List<String> getAmenities() {
        return amenities;
    }

    public void addAmenity(String amenity) {
        amenities.add(amenity);
    }

}

