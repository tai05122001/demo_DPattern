package com.example.demo_ds_pattern.controller.builder.carParts;

public class Windscreen {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Windscreen(String name) {
        this.name = name;
    }
}
