package com.example.Movie_front_end;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@org.springframework.cloud.openfeign.FeignClient("movie-backend")
public interface FeignClient {

    @GetMapping("movies/random")
    public Movies getRandom();
    @PostMapping("movies/genre")
    public List<Movies> specGenre(@RequestBody String s);
}
