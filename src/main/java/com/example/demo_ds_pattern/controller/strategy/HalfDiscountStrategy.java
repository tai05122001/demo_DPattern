package com.example.demo_ds_pattern.controller.strategy;

import com.example.demo_ds_pattern.interfaces.IPromoteStrategy;

public class HalfDiscountStrategy implements IPromoteStrategy {
    @Override
    public double DoDiscount(double price) {
        return 0.5* price;
    }
}
