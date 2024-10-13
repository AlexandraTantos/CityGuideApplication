package classes;

import interfaces.IPlace;

import java.util.ArrayList;
import java.util.List;

public class Planner {
    private List<IPlace> placesToVisit;

    public Planner() {
        placesToVisit = new ArrayList<>();
    }

    public void addPlace(IPlace place) {
        placesToVisit.add(place);
    }

    public void removePlace(IPlace place) {
        placesToVisit.remove(place);
        System.out.println(place.getName() + " has been removed from your planner.");
    }

    public List<IPlace> getPlacesToVisit() {
        return placesToVisit;
    }

    public void showPlanner() {
        if (placesToVisit.isEmpty()) {
            System.out.println("Your planner is empty.");
        } else {
            System.out.println("Places in your planner:");
            for (int i = 0; i < placesToVisit.size(); i++) {
                System.out.println((i + 1) + ". " + placesToVisit.get(i).getName());
            }
        }
    }
}


