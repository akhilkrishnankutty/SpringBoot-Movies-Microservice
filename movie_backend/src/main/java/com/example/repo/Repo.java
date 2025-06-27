package com.example.repo;

import com.example.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repo extends JpaRepository<Movie,Integer> {
    List<Movie> findByGenresContaining(String s);
}

