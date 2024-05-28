package org.demo.statePattern;

public class CreatedState implements ShipmentState {
    @Override
    public void load(ShipmentContext shipmentContext) {
        shipmentContext.setShipmentState(new LoadedState());
        System.out.println("Shipment Created. Current state: Loaded");
    }

    @Override
    public void unload(ShipmentContext shipmentContext) {
        shipmentContext.setShipmentState(new InvalidState());
        System.out.println("Invalid transition. Current state: InvalidState");
    }
}
