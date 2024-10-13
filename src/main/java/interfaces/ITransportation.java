package interfaces;

import types.TransportationType;

public interface ITransportation {
    TransportationType getType();
    int getDuration();
}
