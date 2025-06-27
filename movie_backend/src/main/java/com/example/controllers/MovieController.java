package com.example.controllers;

import com.example.model.Movie;
import com.example.services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieController {
    @Autowired
    MovieServices service;
    @GetMapping("random")
    public Movie getRandom(){
        return service.Random();
    }
    @PostMapping("genre")
    public List<Movie> specGenre(@RequestBody String s){
        System.out.println(s);
        return service.SpecificGenres(s);
    }
    @GetMapping("hoi")
    public String hoi(){
        return "hoi";
    }
}
