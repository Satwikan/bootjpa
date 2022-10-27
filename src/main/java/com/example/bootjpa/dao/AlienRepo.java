package com.example.bootjpa.dao;

import com.example.bootjpa.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens")
public interface AlienRepo extends JpaRepository<Alien, Integer> {
    List<Alien> findByTech(String tech);
    
    
//     List<Alien> findByTech(String tech);
    
}
