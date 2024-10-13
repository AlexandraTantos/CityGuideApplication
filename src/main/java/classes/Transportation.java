package classes;

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
}
