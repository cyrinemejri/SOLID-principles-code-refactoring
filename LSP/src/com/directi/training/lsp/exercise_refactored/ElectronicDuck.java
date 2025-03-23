package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck extends Duck {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    @Override
    public void quack() {
        if (!isOn) {
            turnOn();
            System.out.println("Electronic duck quack...");
            turnOff();
        }
        else {
            System.out.println("Electronic duck quack....");
        }
    }

    @Override
    public void swim() {
        if (!isOn) {
            turnOn();
            System.out.println("Electronic duck swim...");
            turnOff();
        }
        else {
            System.out.println("Electronic duck swim....");
        }
    }
}
