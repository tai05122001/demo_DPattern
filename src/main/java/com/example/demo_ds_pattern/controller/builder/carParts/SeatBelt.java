package com.example.demo_ds_pattern.controller.builder.carParts;

public class SeatBelt {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public SeatBelt(String brand) {
        this.brand = brand;
    }

    public SeatBelt() {

    }

}
