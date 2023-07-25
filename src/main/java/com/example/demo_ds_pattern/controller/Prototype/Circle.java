package com.example.demo_ds_pattern.controller.Prototype;

import com.example.demo_ds_pattern.abstractclasses.Shape;

public class Circle extends Shape {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle);
        this.radius= circle.radius;

    }

    public Circle() {

    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public void show()
    {
        super.show();
        System.out.println("Radius: " + getRadius());
        System.out.println("------------------------------");

    }
}
