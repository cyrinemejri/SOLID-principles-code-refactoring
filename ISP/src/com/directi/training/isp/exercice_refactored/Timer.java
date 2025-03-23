package com.directi.training.isp.exercice_refactored;

import java.util.TimerTask;

public class Timer {
    public void register(long timeOut, ITimerCallback callback) {
        new java.util.Timer().schedule(
            new TimerTask() {
                @Override
                public void run() {
                    callback.timeOutCallback(); // Appel spécifique au timer
                }
            }, timeOut
        );
    }
}