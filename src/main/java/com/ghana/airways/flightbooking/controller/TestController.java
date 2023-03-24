package com.ghana.airways.flightbooking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/welcome")
	public String getInfor() {
		return "<h1> Jesus is good for ghanaians all over the world </h1>";
	}

}
