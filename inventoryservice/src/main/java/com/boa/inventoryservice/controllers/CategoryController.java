package com.boa.inventoryservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.inventoryservice.models.Category;
import com.boa.inventoryservice.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired  
	private CategoryService categoryService;    
    
    @PostMapping({"/v1.0", "/v1.1"})
    public ResponseEntity<?> addCategory(@RequestBody Category category){
    	Category categoryObj=this.categoryService.addCategory(category);
    	if(categoryObj!=null)
    		return ResponseEntity.status(HttpStatus.ACCEPTED).body(categoryObj);
    	else
    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Category Not saved");
    	
    }
    

	
}
