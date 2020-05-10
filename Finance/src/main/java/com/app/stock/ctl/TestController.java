package com.app.stock.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/a")
	public String index() {
		return "Hello Test!!";
	}
}
