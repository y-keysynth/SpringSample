package com.example.demo.trySparing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloCotroller {

	@GetMapping("/hello")
	public String getHello() {
		return "hello";
	}
}
