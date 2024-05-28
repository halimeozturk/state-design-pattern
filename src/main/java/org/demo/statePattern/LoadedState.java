package org.demo.statePattern;

public class LoadedState implements ShipmentState {
    @Override
    public void load(ShipmentContext shipmentContext) {
        shipmentContext.setShipmentState(new InvalidState());
        System.out.println("Invalid transition. Current state: InvalidState");
    }

    @Override
    public void unload(ShipmentContext shipmentContext) {
        shipmentContext.setShipmentState(new UnloadedState());
        System.out.println("Unload operation performed. Current state: Unloaded");
    }
}
