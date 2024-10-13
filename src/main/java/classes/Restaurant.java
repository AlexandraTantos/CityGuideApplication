package classes;

import types.PlaceType;

import java.util.List;

public class Restaurant extends Place {
    private String openingHours;

    public Restaurant(String name, List<Transportation> transportationMethods, String openingHours) {
        super(name, PlaceType.RESTAURANT, transportationMethods);
        this.openingHours = openingHours;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }
}