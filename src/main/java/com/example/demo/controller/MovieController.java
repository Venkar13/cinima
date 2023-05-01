package com.example.demo.controller;
import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class MovieController {
    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<?> getAllMovies(@RequestParam Map<String, String> dates) {
        List<Movie> movies = movieService.getAllMovies();
        return ResponseEntity.status(HttpStatus.OK).body(movies);
    }

    @GetMapping("/movies/{movie_id}")
    public ResponseEntity<?> getMovieById(@PathVariable Long movie_id) {
        Movie movie = movieService.getMovieById(movie_id);
        return ResponseEntity.status(HttpStatus.OK).body(movie);
    }
}

