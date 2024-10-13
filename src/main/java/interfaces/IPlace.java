package interfaces;

import classes.Transportation;

import java.util.List;

public interface IPlace {
    String getName();
    List<Transportation> getTransportationMethods();
}

