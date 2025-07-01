package com.example.kiki2.controllers;

import com.example.kiki2.models.Car;
import com.example.kiki2.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> getCars() {
        return carService.getAllCars();
    }

    @PostMapping("/cars")
    public void addCar(@RequestBody Car car) {
        carService.addCar(car);
    }
}