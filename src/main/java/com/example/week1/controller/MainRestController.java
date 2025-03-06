package com.example.week1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @GetMapping("/")
  public String mainPage() {
    return "main";
  }

}
