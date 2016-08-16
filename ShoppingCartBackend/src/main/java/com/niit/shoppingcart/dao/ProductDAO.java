package com.niit.shoppingcart.dao;

import com.niit.shoppingcart.model.Product;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository


public interface ProductDAO {
	
	public boolean save(Product product);
	
	public boolean update(Product product);
	
	public boolean delete(Product product);
	
    public Product       get(String id);
	
    public List<Product>    list();
    
    
    
    
    
    
}
