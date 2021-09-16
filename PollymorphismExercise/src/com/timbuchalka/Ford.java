package com.timbuchalka;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Ford´s engine is starting";
    }

    @Override
    public String accelerate() {
        return "The Ford is accelerating";
    }

    @Override
    public String brake() {
        return "The Ford is braking";
    }
}
