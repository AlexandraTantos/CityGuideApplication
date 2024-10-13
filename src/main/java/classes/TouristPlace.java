package classes;

import types.PlaceType;

import java.util.List;

public class TouristPlace extends Place {
    private String openingHours;

    public TouristPlace(String name, List<Transportation> transportationMethods, String openingHours) {
        super(name, PlaceType.TOURIST_PLACE, transportationMethods);
        this.openingHours = openingHours;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }
}
