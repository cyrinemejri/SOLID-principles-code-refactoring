package com.directi.training.srp.exercise_refactored.manager;

import com.directi.training.srp.exercise_refactored.model.Car;
import com.directi.training.srp.exercise_refactored.services.CarRecommender;
import com.directi.training.srp.exercise_refactored.services.CarNameFormatter;

public class CarManager
{
    private final CarNameFormatter carNameFromatter;
    private final CarRecommender carRecommender;
    public CarManager(){
        carNameFromatter = new CarNameFormatter();
        carRecommender = new CarRecommender();
    }
    public String getCarNames()
    {
        return carNameFromatter.getCarNames();
    }

    public Car getBestCar()
    {
        return carRecommender.getBestCar();
    }
}
