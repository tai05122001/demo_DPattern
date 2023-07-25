package com.example.demo_ds_pattern.interfaces;

import com.example.demo_ds_pattern.controller.builder.Car;
import com.example.demo_ds_pattern.controller.builder.CarBuilder;
import com.example.demo_ds_pattern.controller.builder.carParts.Engine;
import com.example.demo_ds_pattern.controller.builder.carParts.SeatBelt;
import com.example.demo_ds_pattern.controller.builder.carParts.Windscreen;

public interface ICarBuilder {
    CarBuilder addWheels(int numberOfWheels);
    CarBuilder addSeatBelt(SeatBelt seatBelt);
    CarBuilder addEngine(Engine engine);
    CarBuilder addColor(String color);
    CarBuilder addWindscreen(Windscreen windscreen);

    Car build();


}
