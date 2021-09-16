package com.timbuchalka;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Mitsubishi´s engine is starting";
    }

    @Override
    public String accelerate() {
        return "The Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        return "The Mitsubishi is braking";
    }
}
