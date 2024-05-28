package org.demo.noStatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        ShipmentState shipmentState = new ShipmentState();

        //Created -> Loaded
        System.out.println("Enter state transition value (1 for CREATED, 2 for LOADED, 3 for UNLOADED):");
        String value1 = getState();
        shipmentState.updateState(Integer.parseInt(value1));

        // Loaded -> Unloaded
        System.out.println("Enter next state transition value (1 for CREATED, 2 for LOADED, 3 for UNLOADED):");
        String value2 = getState();
        shipmentState.updateState(Integer.parseInt(value2));
    }

    static String getState() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}