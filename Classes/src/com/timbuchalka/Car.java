package com.timbuchalka;

import java.util.Locale;

public class Car {

    private int doors; // state of the car; field
    private int wheels; // state of the car; field
    private String model; // state of the car; field
    private String engine; // state of the car; field
    private String colour; // state of the car; field

    public void setModel(String model) {

        String validModel = model.toLowerCase();

        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model; // this is to update the model using a method
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel() {
        return this.model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return this.wheels;
    }
}
