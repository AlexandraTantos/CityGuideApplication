package models;

import types.PlaceType;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends Place {
    private List<String> amenities;
    private String operatingHours;

    public Hotel(String name, List<Transportation> transportationMethods, List<String> amenities, String operatingHours) {
        super(name, PlaceType.HOTEL, transportationMethods);
        this.amenities = new ArrayList<>(amenities);
        this.operatingHours = operatingHours;
    }

    public Hotel(String name, List<Transportation> transportationMethods, List<String> amenities) {
        super(name, PlaceType.HOTEL, transportationMethods);
        this.amenities = new ArrayList<>(amenities);
    }

    @Override
    public String getOperatingHours() {
        return operatingHours;
    }

    public String getAmenitiesAsString() {
        if (amenities == null || amenities.isEmpty()) {
            return "No amenities available.";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < amenities.size(); i++) {
            sb.append(amenities.get(i));

            if (i < amenities.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString().trim();
    }

    public void addAmenity(String amenity) {
        amenities.add(amenity);
    }

}

