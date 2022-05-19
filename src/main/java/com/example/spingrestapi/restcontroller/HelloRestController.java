package com.example.spingrestapi.restcontroller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

 @RequestMapping(value ={"","/","/home"})
 public String sayeHello(){
  return "Hello from Bridgelabz";
 }
 @RequestMapping(value ={"/query"},method= RequestMethod.GET)
  public String sayeHelloWithParam(@RequestParam(value="name") String name){
   return "Hello "+name+"";
   }
// @GetMapping("/param/{name}")
// public String sayeHelloWithPathVariable(@PathVariable String name){
//  return "Hello "+name+"";
// }


}
