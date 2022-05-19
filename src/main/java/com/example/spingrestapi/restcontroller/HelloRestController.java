package com.example.spingrestapi.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloRestController {

 @RequestMapping(value ={"","/","/home"})
  public String sayeHello(){
   return "Hello from Bridgelabz";
   }

}
