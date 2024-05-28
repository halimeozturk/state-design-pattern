package org.demo.statePattern;

public class UnloadedState implements ShipmentState {
    @Override
    public void load(ShipmentContext shipmentContext) {
        shipmentContext.setShipmentState(new InvalidState());
        System.out.println("Invalid transition. Current state: InvalidState");
    }

    @Override
    public void unload(ShipmentContext shipmentContext) {
        shipmentContext.setShipmentState(new InvalidState());
        System.out.println("Invalid transition. Current state: InvalidState");
    }
}
