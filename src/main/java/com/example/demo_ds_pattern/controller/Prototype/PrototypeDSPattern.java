package com.example.demo_ds_pattern.controller.Prototype;


import com.example.demo_ds_pattern.abstractclasses.Shape;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "prototype")
public class PrototypeDSPattern {

    @GetMapping
    public String index(){

        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setRadius(45);
        shapes.add(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(20);
        rectangle.setY(20);
        rectangle.setWidth(20);
        rectangle.setHeight(40);
        shapes.add(rectangle);

        shapes.forEach(t-> shapesCopy.add(t.clone()));

        shapesCopy.forEach(t-> t.show());

        return "index";
    }
}
