package models;

import types.PlaceType;

import java.util.List;

public class Mall extends Place {
    private String operatingHours;

    public Mall(String name, List<Transportation> transportationMethods, String operatingHours) {
        super(name, PlaceType.MALL, transportationMethods);
        this.operatingHours = operatingHours;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
