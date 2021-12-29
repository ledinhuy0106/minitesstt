package com.example.controller;

import com.example.model.Category;
import com.example.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/categorys")
public class CategoryController {
    @Autowired
    CategoryService categoryService;


    //Hoàn thành
    @GetMapping("")
    public ResponseEntity<Iterable<Category>> findAllCategory(){
        Iterable<Category> categories=categoryService.findAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
