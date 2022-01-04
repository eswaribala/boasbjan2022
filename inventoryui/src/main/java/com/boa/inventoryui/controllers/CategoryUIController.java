package com.boa.inventoryui.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.boa.inventoryui.models.Category;

@Controller
public class CategoryUIController {
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${apiUrl}")
	private String serviceUrl;

	@GetMapping("/")
	public String getIndex(Model model) {
		
	ResponseEntity<Category[]> responseEntity=restTemplate.exchange(serviceUrl,
			HttpMethod.GET,null,Category[].class);
		
	Category[] categories=responseEntity.getBody();
	List<Category> categoryList=Arrays.asList(categories);
	model.addAttribute("catelogyList", categoryList);
		return "index";
	}
}
