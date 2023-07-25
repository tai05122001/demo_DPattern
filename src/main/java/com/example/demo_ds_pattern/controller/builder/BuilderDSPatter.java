package com.example.demo_ds_pattern.controller.builder;


import com.example.demo_ds_pattern.controller.builder.carParts.Engine;
import com.example.demo_ds_pattern.controller.builder.carParts.SeatBelt;
import com.example.demo_ds_pattern.controller.builder.carParts.Windscreen;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("builder")
public class BuilderDSPatter {

    @GetMapping
    public String index(){

        CarBuilder carBuilder = new CarBuilder()
                .addColor("green")
                .addEngine(new Engine("V16"))
                .addSeatBelt(new SeatBelt("2"))
                .addWindscreen(new Windscreen("None"))
                .addWheels(16);
        Car car = carBuilder.build();

        System.out.println(car.toString());
        return "index";
    }
}
