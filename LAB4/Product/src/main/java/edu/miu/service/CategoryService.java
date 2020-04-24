package edu.miu.service;

import java.util.List;

import edu.miu.domain.Category;
import edu.miu.domain.Product;

public interface CategoryService  {
       public Category getCategory(int id);
       public List<Category> getAll();
}
 
