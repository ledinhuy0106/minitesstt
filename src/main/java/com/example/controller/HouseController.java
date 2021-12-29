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


    //Hoàn thành
    @PutMapping("/{id}")
    public ResponseEntity<House> update(@PathVariable Long id, @RequestBody House house) {
        house.setId(id);
        houseService.save(house);
        return new ResponseEntity<>(house, HttpStatus.OK);
    }

    //Hoàn thành
    @GetMapping("/bath2")
    public ResponseEntity<Iterable<House>> findAllByBathGreaterThan() {
        Iterable<House> houses = houseService.findAllByBathGreaterThan(2);
        return new ResponseEntity<>(houses, HttpStatus.OK);
    }
    //Hoàn thành
    @GetMapping("/findbyname")
    public ResponseEntity<Iterable<House>> findByName() {
        Iterable<House> houses = houseService.findAllByOrderByName();
        return new ResponseEntity<>(houses, HttpStatus.OK);
    }

}

