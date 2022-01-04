package com.boa.inventoryservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.inventoryservice.models.Category;
import com.boa.inventoryservice.models.Product;
import com.boa.inventoryservice.repositories.CategoryRepo;

@Service
public class CategoryService {
    @Autowired
	private CategoryRepo categoryRepo;    
    //insert
    
    public Category addCategory(Category category) {
    	
    	if(category.getProductList().size()>0) {
    		for(Product product:category.getProductList()) {
    			product.setCategory(category);
    		}    		   		
    	}    	
    	return this.categoryRepo.save(category);
    	
    }
    
    //select all
    
    public List<Category> fetchAllCategories(){
    	
    	return this.categoryRepo.findAll();
    }
    
    //select by Id
    
    public Category fetchCategoryById(long categoryId) {
    	return this.categoryRepo.findById(categoryId).orElse(null);
    }
    
    //delete
    
    public boolean deleteCategoryById(long categoryId) {
    	boolean status=false;
    	this.categoryRepo.deleteById(categoryId);
         if(this.fetchCategoryById(categoryId)==null)
        	 status=true;
         return status;
        	 
    }
    
}
