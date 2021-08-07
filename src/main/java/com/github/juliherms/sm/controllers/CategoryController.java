package com.github.juliherms.sm.controllers;

import com.github.juliherms.sm.entities.Category;
import com.github.juliherms.sm.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * This class responsible to provide category endpoint
 */
@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping
    public List<Category> listAll(){
        return service.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Category>> findById(@PathVariable Long id){
        Optional<Category> category = service.findById(id);
        return  category.isPresent() ? ResponseEntity.ok(category) : ResponseEntity.notFound().build();
    }

    @PostMapping()
    public ResponseEntity<Category> save(@RequestBody Category category){
        Category categorySaved = service.save(category);
        return ResponseEntity.status(HttpStatus.CREATED).body(categorySaved);
    }
}
