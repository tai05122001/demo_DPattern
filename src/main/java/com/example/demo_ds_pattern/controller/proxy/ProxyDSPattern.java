package com.example.demo_ds_pattern.controller.proxy;


import com.example.demo_ds_pattern.interfaces.IBookService;
import com.example.demo_ds_pattern.interfaces.IRemote;
import com.example.demo_ds_pattern.model.proxy.BookProxy;
import com.example.demo_ds_pattern.model.proxy.LazyRemoteProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.rmi.Remote;
import java.util.Random;

@Controller
@RequestMapping(path = "/proxy")
public class ProxyDSPattern   {

    @GetMapping
    public String index(){

//        IRemote remoteProxy = new LazyRemoteProxy();
//
//        remoteProxy.turnOff();
//
//        remoteProxy.turnOn();

        Random r =  new Random();
        int index = r.nextInt(0,2);
        IBookService bookProxy = new BookProxy(index == 0? false: true);

        bookProxy.read("F:\\SparkMinds\\file_bc\\demo\\demo_DS_pattern\\demo.txt");
        return "index";
    }
}
