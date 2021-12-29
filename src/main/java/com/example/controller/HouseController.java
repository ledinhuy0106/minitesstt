package com.example.controller;

import com.example.model.House;
import com.example.service.impl.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("api/houses")
@CrossOrigin("*")
public class HouseController {
    @Autowired
    HouseService houseService;

    //Hoàn thành
    @GetMapping("")
    public ResponseEntity<Iterable<House>> findAll() {
        Iterable<House> houses = houseService.findAll();
        return new ResponseEntity<>(houses, HttpStatus.OK);
    }
    //Hoàn thành
    @GetMapping("/{id}")
    public ResponseEntity<House> findById(@PathVariable Long id) {
        Optional<House> house = houseService.findById(id);
        return new ResponseEntity<>(house.get(), HttpStatus.OK);
    }


    //Hoàn thành
    @DeleteMapping("/{id}")
    public ResponseEntity<House> delete(@PathVariable Long id) {
        houseService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }






}

