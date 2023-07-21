package com.example.demo_ds_pattern.model;

import javax.xml.crypto.Data;
import java.util.List;

public class Product {
    private int id ;
    private int idCat;
    String title;
    float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(int id, int idCat, String title, float price) {
        this.id = id;
        this.idCat = idCat;
        this.title = title;
        this.price = price;
    }
    public void input(){
        List<Category> categories = DataMgr.getInstance().getCategories();
    }
}
