package org.demo.statePattern;

public interface ShipmentState {
    void load(ShipmentContext shipmentContext);

    void unload(ShipmentContext shipmentContext);
}
