package edu.miu.repository;

import edu.miu.domain.Product;

import java.util.List;

public interface ProductRepository {

    public List<Product> getAll();

    public void save(Product product);

}
