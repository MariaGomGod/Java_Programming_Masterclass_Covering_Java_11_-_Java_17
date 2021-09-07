package com.timbuchalka;

public class Case {

    private String modal;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String modal, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.modal = modal;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModal() {
        return modal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
