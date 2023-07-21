package com.example.demo_ds_pattern.controller;

import com.example.demo_ds_pattern.controller.strategy.EightyDiscountStrategy;
import com.example.demo_ds_pattern.controller.strategy.HalfDiscountStrategy;
import com.example.demo_ds_pattern.controller.strategy.NoDiscountStrategy;
import com.example.demo_ds_pattern.controller.strategy.QuarterDiscountStrategy;
import com.example.demo_ds_pattern.model.Ticket;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping(path = "strategy")
public class StrategyDSPattern {

    @GetMapping
    public String index(){
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            
            Ticket ticket = new Ticket();
            ticket.setName("Ticket"+ i);
            ticket.setPrice(50 * i+1);

            generatePromoteStrategy(r, ticket);
            System.out.println(ticket.toString());

            generatePromoteStrategy(r, ticket);
            System.out.println(ticket.toString());

        }
        return "strategy";

    }

    private static void generatePromoteStrategy(Random r, Ticket ticket) {
        int strategyIndex = r.nextInt(0,4);
        switch (strategyIndex){
            case 0:
                ticket.setPromoteStrategy(new HalfDiscountStrategy());
                break;
            case 1:
                ticket.setPromoteStrategy(new QuarterDiscountStrategy());
                break;
            case 2:
                ticket.setPromoteStrategy(new EightyDiscountStrategy());
                break;
            default:
                ticket.setPromoteStrategy(new NoDiscountStrategy());
                break;
        }
    }

}
