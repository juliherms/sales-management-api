package com.github.juliherms.sm.services;

import com.github.juliherms.sm.entities.Category;
import com.github.juliherms.sm.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * This class responsible to represents business logical for category
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    public List<Category> listAll() {
        return repo.findAll();
    }

    public Optional<Category> findById(Long id){
        return repo.findById(id);
    }
}
