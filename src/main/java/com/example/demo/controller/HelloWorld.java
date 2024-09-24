package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 */
@RestController
@RequestMapping("/hello")
public class HelloWorld {


  @RequestMapping("/say")
  public String sayHello() {
    return "Hello World";
  }

}
