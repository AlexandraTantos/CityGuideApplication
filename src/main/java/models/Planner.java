package models;

import interfaces.IPlace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Planner {
    private List<IPlace> places;

    private final Map<IPlace, String> plannerPlacesWithTimes = new HashMap<>();

    public Planner() {
        places = new ArrayList<>();
    }

    public void addPlaceWithTime(IPlace place, String visitTime) {
        if (!places.contains(place)) {
            places.add(place);
        }
        plannerPlacesWithTimes.put(place, visitTime);
    }

    public Map<IPlace, String> getPlacesWithTimes() {
        return plannerPlacesWithTimes;
    }

    public void removePlace(IPlace place) {
        places.remove(place);
        plannerPlacesWithTimes.remove(place);
        System.out.println(place.getName() + " has been removed from your planner.");
    }
}
