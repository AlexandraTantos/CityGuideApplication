package models;

import interfaces.ICity;
import types.PlaceType;

import java.util.ArrayList;
import java.util.List;

public class City implements ICity {
    private String name;
    private String description;
    private List<Place> places;

    public City(String name, String description) {
        this.name = name;
        this.description = description;
        this.places = new ArrayList<>();
    }

    @Override
    public void addPlace(Place place) {
        this.places.add(place);
    }

    public List<Place> getPlacesByType(PlaceType type) {
        return places.stream().filter(place -> place.getType() == type).toList();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

}
