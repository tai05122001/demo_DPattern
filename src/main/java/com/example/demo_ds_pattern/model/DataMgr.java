package com.example.demo_ds_pattern.model;

import java.util.ArrayList;
import java.util.List;

public class DataMgr {
    List<Category> categories;
    List<Product> products;

    private static DataMgr instance = null ;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public static void setInstance(DataMgr instance) {
        DataMgr.instance = instance;
    }

    public synchronized static DataMgr getInstance(){
        if(instance == null ){
            instance = new DataMgr();
        }
        return instance;
    }

    private DataMgr() {
        categories = new ArrayList<>();
        products = new ArrayList<>();
        System.out.println("Init DataMgr object");
    }

    private DataMgr(List<Category> categories, List<Product> products) {
        this.categories = categories;
        this.products = products;
    }
}
