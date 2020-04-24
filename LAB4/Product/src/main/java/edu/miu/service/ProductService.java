package edu.miu.service;

import java.util.List;

import edu.miu.domain.Product;

public interface ProductService   {

   public List<Product> getAll();

   public void save(Product product);



}
 
