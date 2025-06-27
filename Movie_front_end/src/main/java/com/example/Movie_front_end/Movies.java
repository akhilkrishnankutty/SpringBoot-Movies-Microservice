package com.example.Movie_front_end;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Movies {
    private int movieid;
    private String title;
    private String genres;

    public Movies() {
    }

    public Movies(int movieid, String title, String genres) {
        this.movieid = movieid;
        this.title = title;
        this.genres = genres;
    }

    public int getMovieid() {
        return movieid;
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

    @Override
    public String toString() {
        return "Movies{" +
                "movieid=" + movieid +
                ", title='" + title + '\'' +
                ", genres='" + genres + '\'' +
                '}';
    }
}
