package com.dongyiding.web;

import com.dongyiding.service.SchedualServiceHiHystric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HiController {

    @Autowired
    SchedualServiceHiHystric schedualServiceHiHystric;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHiHystric.sayHiFromClientOne(name);
    }
}

