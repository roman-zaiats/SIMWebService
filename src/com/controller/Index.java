/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {

    @RequestMapping(value = "/")
    public String in() {
        return "index";
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

}
