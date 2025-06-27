package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
@Entity
@Table(name = "movies")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieid;
    private String title;
    private String genres;

    public int getMovieid() {
        return movieid;
    }

    public Movie(int movieid, String title, String genres) {
        this.movieid = movieid;
        this.title = title;
        this.genres = genres;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieid=" + movieid +
                ", title='" + title + '\'' +
                ", genres='" + genres + '\'' +
                '}';
    }
}
