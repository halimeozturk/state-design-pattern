package org.demo.statePattern;

public class InvalidState implements ShipmentState {
    @Override
    public void load(ShipmentContext shipmentContext) {
        System.out.println("Invalid transition: Load operation is not allowed in the current state");
    }

    @Override
    public void unload(ShipmentContext shipmentContext) {
        System.out.println("Invalid transition: Unload operation is not allowed in the current state");
    }
}
