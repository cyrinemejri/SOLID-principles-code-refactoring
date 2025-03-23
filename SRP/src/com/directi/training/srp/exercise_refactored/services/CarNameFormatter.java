package com.directi.training.srp.exercise_refactored.services;

import com.directi.training.srp.exercise_refactored.model.Car;
import com.directi.training.srp.exercise_refactored.repository.CarRepository;

import java.util.List;

public class CarNameFormatter {

    private final CarRepository carRepository;
    public CarNameFormatter()
    {
        carRepository = new CarRepository();
    }

    public String getCarNames()
    {
        List<Car> cars = carRepository.findAll();
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
