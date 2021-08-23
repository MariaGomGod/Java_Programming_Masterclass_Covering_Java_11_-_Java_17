package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car(); // object of type Car called porsche (based on the template Car)
        Car holden = new Car(); // object of type Car called holden (based on the template Car)
        porsche.setModel("carrera");
        System.out.println("Model is " + porsche.getModel());
        porsche.setDoors(3);
        System.out.println("Doors are: " + porsche.getDoors());
        porsche.setWheels(4);
        System.out.println("Wheels are: " + porsche.getWheels());
    }
}
