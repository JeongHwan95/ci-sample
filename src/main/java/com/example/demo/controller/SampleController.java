package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController {

    List<String> list = List.of("item1", "item2");

    @GetMapping("/")
    public String home(){

        return "Hello";
    }

    @GetMapping("/items")
    public List<String> findItems(){

        return list;
    }
}
