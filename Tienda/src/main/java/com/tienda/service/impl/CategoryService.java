package com.tienda.service.impl;

import com.tienda.db.ICategoryRepository;
import com.tienda.entities.Category;
import com.tienda.service.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService extends BaseService<Category, Integer> implements ICategoryService {
    private final ICategoryRepository categoryRepository;
    public CategoryService(ICategoryRepository categoryRepository) {
        super(categoryRepository);
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getCategories(boolean activos) {
        return null;
    }

    @Override
    public Category getCategory(Category category) {
        return null;
    }
}