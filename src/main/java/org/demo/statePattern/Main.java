package org.demo.statePattern;

public class Main {
    public static void main(String[] args) {
        ShipmentContext shipmentContext = new ShipmentContext();

        shipmentContext.setShipmentState(new CreatedState());
        shipmentContext.load();

        shipmentContext.setShipmentState(new LoadedState());
        shipmentContext.unload();

        shipmentContext.setShipmentState(new UnloadedState());
        shipmentContext.unload();
    }
}