package com.boa.inventoryui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryUIController {

	@GetMapping("/")
	public String getIndex() {
		return "index";
	}
}
