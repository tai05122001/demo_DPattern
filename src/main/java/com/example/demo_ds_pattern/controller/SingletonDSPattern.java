package com.example.demo_ds_pattern.controller;

import com.example.demo_ds_pattern.model.DataMgr;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class SingletonDSPattern {
        @GetMapping
        public String index(){
                DataMgr dataMgr = DataMgr.getInstance();
                DataMgr dataMgr1 = DataMgr.getInstance();
            return "index";
        }

}
