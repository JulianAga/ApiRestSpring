package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class GreetingController {

	@PostMapping("/greeting")
	public List<String> greeting()
	{
		return Arrays.asList("hola avalith","holaaa");
	}
	
}
