package org.demo.noStatePattern;

public class ShipmentState {
    private static final int CREATED = 1;
    private static final int LOADED = 2;
    private static final int UNLOADED = 3;
    private static final int INVALID_STATE = 4;

    private int currentState;

    public ShipmentState() {
        this.currentState = CREATED;
    }

    public void updateState(int value) {
        if (currentState == CREATED && value == LOADED) {
            currentState = LOADED;
            System.out.println("Shipment Created. Current state: LOADED");
        } else if (currentState == LOADED && value == UNLOADED) {
            currentState = UNLOADED;
            System.out.println("Unload operation performed. Current state: UNLOADED");
        } else {
            currentState = INVALID_STATE;
            System.out.println("Invalid transition: Current state: INVALID_STATE");
        }
    }
}
