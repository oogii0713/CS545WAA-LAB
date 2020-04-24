package edu.miu.serviceimpl;

import edu.miu.domain.Category;
import edu.miu.repository.CategoryRepository;
import edu.miu.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    @Override
    public Category getCategory(int id) {
        return categoryRepository.getCategory(id);
    }


}
 
