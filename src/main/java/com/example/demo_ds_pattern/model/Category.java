package com.example.demo_ds_pattern.model;

public class Category {
    private int id ;
    String catName;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }




    public Category() {
    }

    public Category(int id, String catName) {
        this.id = id;
        this.catName = catName;
    }
}
