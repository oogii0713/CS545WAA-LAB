package edu.miu.repository;

import edu.miu.domain.Category;

import java.util.List;

public interface CategoryRepository {
    public Category getCategory(int id);

    public List<Category> getAll();
}
