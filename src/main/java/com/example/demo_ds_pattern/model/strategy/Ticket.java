package com.example.demo_ds_pattern.model.strategy;

import com.example.demo_ds_pattern.interfaces.IPromoteStrategy;

public class Ticket {
    private IPromoteStrategy _promoteStrategy;
    private double price ;
    private String name;

    public IPromoteStrategy getPromoteStrategy() {
        return _promoteStrategy;
    }


    public void setPromoteStrategy(IPromoteStrategy promoteStrategy) {
        this._promoteStrategy = promoteStrategy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ticket(IPromoteStrategy iPromoteStrategy) {
        _promoteStrategy = iPromoteStrategy;
    }

    public Ticket() {
    }

    public double getPromotedPrice(){
        return _promoteStrategy.DoDiscount(price);
    }

    @Override
    public String toString() {
        return "Name: " + getName()
                + "\nPromoted price: " + getPromotedPrice()
                + "\nPrice: " + getPrice()
                + "\nType Discount: " + getPromoteStrategy().getClass().getTypeName().split("\\.")[getPromoteStrategy().getClass().getTypeName().split("\\.").length-1]
                + "\n----------------\n";
    }
}
