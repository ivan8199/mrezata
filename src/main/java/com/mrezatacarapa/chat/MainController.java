package com.mrezatacarapa.chat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "brat";
    }

    @GetMapping("/")
    public String index() {
        return "main";
    }

    @GetMapping("/sah")
    public String sah() {
        return "conva-test";
    }
}