package com.boa.inventoryui.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
		
	ResponseEntity<Category[]> responseEntity=restTemplate.exchange(serviceUrl+"/categories/v1.0",
			HttpMethod.GET,null,Category[].class);
		System.out.println(responseEntity.getBody());
	Category[] categories=responseEntity.getBody();
	List<Category> categoryList=Arrays.asList(categories);
	model.addAttribute("categoryList", categoryList);
		return "index";
	}
	
	@GetMapping("/add")
	public String addCategory() {
		return "addcategory";
	}
	
	
	@PostMapping("/categories")
	public String addWinner(@ModelAttribute("category") Category category) 
	{
		
		  HttpHeaders headers = new HttpHeaders();
		  headers.setContentType(MediaType.APPLICATION_JSON); 
		  HttpEntity<Category> request = new HttpEntity<>(category,headers); 
		  ResponseEntity<?> serviceResponse=restTemplate. postForEntity(serviceUrl+"/categories/v1.0",request,
		  Category.class);
		 
	
		return "redirect:/";

	}
	
}
