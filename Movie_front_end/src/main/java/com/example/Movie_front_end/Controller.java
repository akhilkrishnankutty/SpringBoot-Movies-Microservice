package com.example.Movie_front_end;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    FeignClient client;
    @GetMapping("random")
    public Movies getRandom(){
        return client.getRandom();
    }
    @PostMapping("genre")
    public List<Movies> specGenre(@RequestBody String s){
        System.out.println(s);
        return client.specGenre(s);
    }
}
