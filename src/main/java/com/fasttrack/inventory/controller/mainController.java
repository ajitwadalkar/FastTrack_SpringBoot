package com.fasttrack.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class mainController {
    @RequestMapping("/home")
    public String home(Map<String, Object> model) {

        return "index";
    }

}
