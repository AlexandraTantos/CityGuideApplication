package models;

import interfaces.ITransportation;
import types.TransportationType;

public class Transportation implements ITransportation {
    private TransportationType type;
    private int duration;

    public Transportation(TransportationType type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    @Override
    public TransportationType getType() {
        return type;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    public void setType(TransportationType type) {
        this.type = type;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Type = " + type +
                ", duration = " + duration;
    }
}
