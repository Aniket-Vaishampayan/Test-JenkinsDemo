package com.example.SpringActuatorWithEmailDemo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-actuator")
public class SpringActuatorWithEmailDemoController {

	@GetMapping("/get-data")
	public Map<String, String> getData()
	{
		return Map.of("Name","Aniket Vaishampayan");
	}
}
