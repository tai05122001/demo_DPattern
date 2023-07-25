package com.example.demo_ds_pattern.controller.singleton;

import com.example.demo_ds_pattern.model.singleton.LoginSingleton;
import com.example.demo_ds_pattern.model.strategy.DataMgr;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class SingletonDSPattern {
        @GetMapping
        public String index(){
//                LoginSingleton.getInstance().SayHello();

            // error of Singleton pattern into multithread
            Thread thread1 = new Thread(() -> LoginSingleton.getInstance().SayHello());
            Thread thread2 = new Thread(() -> LoginSingleton.getInstance().SayHello());

            thread1.start();
            thread2.start();

            return "index";
        }

}
