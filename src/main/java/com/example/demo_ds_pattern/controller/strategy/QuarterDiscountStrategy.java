package com.example.demo_ds_pattern.controller.strategy;

import com.example.demo_ds_pattern.interfaces.IPromoteStrategy;

public class QuarterDiscountStrategy implements IPromoteStrategy {
    @Override
    public double DoDiscount(double price) {
        return price * 0.75;
    }
}
