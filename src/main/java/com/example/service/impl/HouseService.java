package com.example.service.impl;

import com.example.model.House;
import com.example.repository.IHouseRepository;
import com.example.service.sevice.IHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HouseService implements IHouseService {
    @Autowired
    IHouseRepository houseRepository;

    @Override
    public Iterable<House> findAll() {
        return houseRepository.findAll();
    }

    @Override
    public Optional<House> findById(Long id) {
        return houseRepository.findById(id);
    }

    @Override
    public void save(House house) {
    houseRepository.save(house);
    }

    @Override
    public void remove(Long id) {
   houseRepository.deleteById(id);
    }

    @Override
    public Iterable<House> findAllByBathGreaterThan(int number){
        return houseRepository.findAllByBathGreaterThan(number);
    }

    @Override
    public Iterable<House> findAllByOrderByName() {
        return houseRepository.findAllByOrderByName();
    }
}
