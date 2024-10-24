package interfaces;

import models.Place;

public interface ICity {
    String getName();
    String getDescription();
    void addPlace(Place place);
}

