package com.example.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private final Repository Repository;

    @Autowired
    public Controller(Repository Repository) {
        this.Repository = Repository;
    }

    @GetMapping("/persons/by-city")
    public List<String> getPersons(@RequestParam("city") String city) {
        return Repository.getPersonsByCity(city);
    }

    @GetMapping("/test")
    public String test() {
        return "Ok";
    }
}