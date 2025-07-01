package com.example.kiki2.models;

public class Car {

    String model;
    String make;
    String colour;

    public Car(String model, String make, String colour) {
        this.model = model;
        this.make = make;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
