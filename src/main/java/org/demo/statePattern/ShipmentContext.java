package org.demo.statePattern;

public class ShipmentContext {
    private ShipmentState shipmentState;

    public ShipmentContext(ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public ShipmentContext() {

    }

    public ShipmentState getShipmentState() {
        return shipmentState;
    }

    public void setShipmentState(ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void load() {
        shipmentState.load(this);
    }

    public void unload() {
        shipmentState.unload(this);
    }
}
