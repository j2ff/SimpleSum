package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
	//sample
	 @GetMapping("/hello")
	    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	      return String.format("Hello %s!", name);
	    }
	 
	
	 
	 @GetMapping("/add")
	    public Integer add(@RequestParam(value = "num1") Integer num1,@RequestParam(value = "num2") Integer num2) {
		 
		 System.out.println(num1+"  "+num2);
		 Sum sum=new Sum();
	      return sum.add(num1,num2);
	    }
	 
	 

}
