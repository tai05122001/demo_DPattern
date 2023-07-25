package com.example.demo_ds_pattern.controller.builder;

import com.example.demo_ds_pattern.controller.builder.carParts.Engine;
import com.example.demo_ds_pattern.controller.builder.carParts.SeatBelt;
import com.example.demo_ds_pattern.controller.builder.carParts.Windscreen;
import com.example.demo_ds_pattern.interfaces.ICarBuilder;

public class CarBuilder implements ICarBuilder {
    private int _numberOfWheels;
    private SeatBelt _seatBelt;
    private String _color;
    private Windscreen _windscreen;
    private Engine _engine;

    @Override
    public CarBuilder addWheels(int numberOfWheels) {
        _numberOfWheels = numberOfWheels;
        return this;

    }

    @Override
    public CarBuilder addSeatBelt(SeatBelt seatBelt) {
        _seatBelt = seatBelt;
        return this;
    }

    @Override
    public CarBuilder addEngine(Engine engine) {
        _engine = engine;
        return this;
    }

    @Override
    public CarBuilder addColor(String color) {
        _color = color;
        return this;
    }

    @Override
    public CarBuilder addWindscreen(Windscreen windscreen) {
        _windscreen = windscreen;
        return this;
    }

    @Override
    public Car build() {
        return new Car(_numberOfWheels,_seatBelt,_color,_windscreen,_engine);
    }
}
