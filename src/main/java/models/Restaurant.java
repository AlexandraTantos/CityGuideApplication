package models;

import types.PlaceType;

import java.util.List;

public class Restaurant extends Place {
    private String operatingHours;

    public Restaurant(String name, List<Transportation> transportationMethods, String operatingHours) {
        super(name, PlaceType.RESTAURANT, transportationMethods);
        this.operatingHours = operatingHours;
    }
    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOpeningHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }
}