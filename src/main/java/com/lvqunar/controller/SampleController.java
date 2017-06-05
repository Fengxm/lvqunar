package com.lvqunar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/6/5.
 */
@RestController
public class SampleController {

    @RequestMapping("/sample")
    public String sample(){
        return "sample";
    }
}
