package com.dongyiding.serviceribbon.web;

import com.dongyiding.serviceribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloControler {



    @Autowired
    HiService hiService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return hiService.hiService(name);
    }


}
