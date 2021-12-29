package com.example.service.sevice;

import com.example.model.House;

public interface IHouseService extends IGeneralService<House> {
    Iterable<House> findAllByBathGreaterThan(int number);
    Iterable<House> findAllByOrderByName();
}
