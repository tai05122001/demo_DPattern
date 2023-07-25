package com.example.demo_ds_pattern.controller.builder;

import com.example.demo_ds_pattern.controller.builder.carParts.Engine;
import com.example.demo_ds_pattern.controller.builder.carParts.SeatBelt;
import com.example.demo_ds_pattern.controller.builder.carParts.Windscreen;

public class Car {
    private int numberOfWheels;
    private SeatBelt seatBelt;
    private String color;
    private Windscreen windscreen;
    private Engine engine;


    public Car(int numberOfWheels, SeatBelt seatBelt, String color, Windscreen windscreen, Engine engine) {
        this.numberOfWheels = numberOfWheels;
        this.seatBelt = seatBelt;
        this.color = color;
        this.windscreen = windscreen;
        this.engine = engine;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public SeatBelt getSeatBelt() {
        return seatBelt;
    }

    public void setSeatBelt(SeatBelt seatBelt) {
        this.seatBelt = seatBelt;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Windscreen getWindscreen() {
        return windscreen;
    }

    public void setWindscreen(Windscreen windscreen) {
        this.windscreen = windscreen;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Number of wheels: " + numberOfWheels +
                "\nSeat belt: " + seatBelt.getBrand() +
                "\nColor: " + color +
                "\nWind Screen: " + windscreen.getName() +
                "\nEngine: " + engine.getName()
                ;
    }
}
