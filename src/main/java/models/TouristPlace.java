package models;

import types.PlaceType;

import java.util.List;

public class TouristPlace extends Place {
    private String operatingHours;

    public TouristPlace(String name, List<Transportation> transportationMethods, String operatingHours) {
        super(name, PlaceType.TOURIST_PLACE, transportationMethods);
        this.operatingHours = operatingHours;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }
}
