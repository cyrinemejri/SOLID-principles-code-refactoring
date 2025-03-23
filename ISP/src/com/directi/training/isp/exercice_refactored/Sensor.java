package com.directi.training.isp.exercice_refactored;

import java.util.Random;

public class Sensor {
    public void register(IProximityCallback callback) {
        while (true) {
            if (isPersonClose()) {
                callback.proximityCallback(); 
                break;
            }
        }
    }

    private boolean isPersonClose() {
        return new Random().nextBoolean();
    }
}
