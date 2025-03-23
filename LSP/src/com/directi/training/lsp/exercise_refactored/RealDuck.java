package com.directi.training.lsp.exercise_refactored;

public class RealDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Quack...");
    }

    @Override
    public void swim() {
        System.out.println("Swim...");
    }
}