package com.novemser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Project: SpringMVCDemo
 * Package: com.novemser.controller
 * Author:  Novemser
 * 2016/11/19
 */
@Controller
public class GreetingController {

    @RequestMapping("/greeting") // maps all HTTP operations by default.
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "world")String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
