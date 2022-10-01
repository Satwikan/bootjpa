package com.example.bootjpa.controller;

import com.example.bootjpa.dao.AlienRepo;
import com.example.bootjpa.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AlienController {
    @Autowired
    AlienRepo repo;
    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }
    @RequestMapping(path="/aliens")
    public List<Alien>  getAliens() {
        return repo.findAll();
    }
    @RequestMapping("/alien/{aid}")
    public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
        return repo.findById(aid);
    }
    @PostMapping(path="/alien", consumes = {"application/json"})
    public Alien  addAlien(@RequestBody Alien alien) {
        repo.save(alien);
        return alien;
    }
    @PutMapping(path="/alien", consumes = {"application/json"})
    public Alien  updateAlien(@RequestBody Alien alien) {
        repo.save(alien);
        return alien;
    }
    @DeleteMapping("/alien/{aid}")
    public Alien deleteAlien(@PathVariable int aid) {
        Alien a = repo.findById(aid).orElse(new Alien());
        repo.delete(a);
        return a;
    }

}
