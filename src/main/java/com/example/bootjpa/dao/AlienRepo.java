package com.example.bootjpa.dao;

import com.example.bootjpa.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Integer> {
    List<Alien> findByTech(String tech);
}
