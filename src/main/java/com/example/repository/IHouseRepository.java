package com.example.repository;

import com.example.model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHouseRepository extends JpaRepository<House,Long> {
    Iterable<House> findAllByBathGreaterThan(int number);
    Iterable<House> findAllByOrderByName();
}
