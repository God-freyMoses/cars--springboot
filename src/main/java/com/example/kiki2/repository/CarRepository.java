
package com.example.kiki2.repository;

import com.example.kiki2.models.Car;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {
    private final List<Car> cars = new ArrayList<>();

    public CarRepository() {

        cars.add(new Car("Camry", "Toyota", "Silver"));
        cars.add(new Car("Model 3", "Tesla", "Red"));
        cars.add(new Car("911", "Porsche", "Black"));
    }

    public List<Car> findAll() {
        return cars;
    }

    public void add(Car car) {
        cars.add(car);
    }
}