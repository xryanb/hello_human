package com.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {


    @RequestMapping("/")
    public String index(@RequestParam(value="q", required=false, defaultValue="human") String searchQuery) {
    	return "Hello " + searchQuery;
    }



}