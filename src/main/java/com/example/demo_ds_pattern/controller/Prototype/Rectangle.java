package com.example.demo_ds_pattern.controller.Prototype;

import com.example.demo_ds_pattern.abstractclasses.Shape;

public class Rectangle extends Shape {

    private int width ;
    private  int height ;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;

    }

    public Rectangle() {

    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public void show()
    {
        super.show();
        System.out.println("Width: " + getWidth()+ "\nHeight: " + getHeight());
        System.out.println("------------------------------");

    }
}
