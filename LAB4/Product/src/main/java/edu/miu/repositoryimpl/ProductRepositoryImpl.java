package edu.miu.repositoryimpl;

import edu.miu.domain.Category;
import edu.miu.domain.Product;
import edu.miu.repository.CategoryRepository;
import edu.miu.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    CategoryRepository categoryRepository;

    private List<Product> listOfProducts;

    /*
     * NOTICE DI on Constructor
     */
    @Autowired
    public ProductRepositoryImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
        listOfProducts = new ArrayList<Product>();
        Category category = categoryRepository.getCategory(1);
        Product bowTie = new Product(1, "Bow Tie", "Loud", (float) 22.0, category);
        listOfProducts.add(bowTie);
    }

    @Override
    public List<Product> getAll() {
        return listOfProducts;
    }

    @Override
    public void save(Product product) {
        listOfProducts.add(product);
        return;
    }


}
 
