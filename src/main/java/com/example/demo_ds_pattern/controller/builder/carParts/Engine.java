package com.example.demo_ds_pattern.controller.builder.carParts;

public class Engine {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine(String name) {
        this.name = name;
    }
}
