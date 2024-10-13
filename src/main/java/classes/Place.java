package classes;

import interfaces.IPlace;
import types.PlaceType;

import java.util.List;

public class Place implements IPlace {
    private String name;
    private PlaceType type;
    private List<Transportation> transportationMethods;

    public Place(String name, PlaceType type, List<Transportation> transportationMethods) {
        this.name = name;
        this.transportationMethods = transportationMethods;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    public PlaceType getType() {
        return type;
    }

    @Override
    public List<Transportation> getTransportationMethods() {
        return transportationMethods;
    }

    @Override
    public String toString() {
        return name;
    }
}
