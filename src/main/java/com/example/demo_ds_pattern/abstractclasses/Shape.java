package com.example.demo_ds_pattern.abstractclasses;

public abstract class Shape {
    private int X ;
    private int Y ;

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public Shape() {
    }

    public Shape(Shape shape ){
        this.X = shape.X ;
        this.Y = shape.Y ;
        this.color = shape.color ;
    }

    public abstract Shape clone();
    public void show(){
        System.out.println("X: " + getX()+ "\nY: "+ getY());

    }

}
