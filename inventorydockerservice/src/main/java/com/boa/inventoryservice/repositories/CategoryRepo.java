package com.boa.inventoryservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.inventoryservice.models.Category;

public interface CategoryRepo extends JpaRepository<Category,Long>{

}
