package models;

import interfaces.IPlace;
import types.PlaceType;

import java.util.List;

public abstract class Place implements IPlace {
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

    @Override
    public PlaceType getType() {
        return type;
    }

    public String getTransportationMethodsAsString() {
        if (transportationMethods == null || transportationMethods.isEmpty()) {
            return "No transportation methods available.";
        }
        StringBuilder sb = new StringBuilder();
        for (Transportation method : transportationMethods) {
            sb.append(method.getType()).append(" ").append(method.getDuration()).append(" mins").append("\n");
        }
        return sb.toString().trim();
    }
    @Override
    public String toString() {
        return name;
    }
}
