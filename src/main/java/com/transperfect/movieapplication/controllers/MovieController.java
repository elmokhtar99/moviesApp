package com.transperfect.movieapplication.controllers;

import com.transperfect.movieapplication.models.Movie;
import com.transperfect.movieapplication.services.IMovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    private final IMovieService movieService;

    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> displayMovies(){
        return ResponseEntity.ok().body(movieService.getAllMovies());
    }
    @GetMapping("/recommendations")
    public ResponseEntity<List<Movie>> displayMoviesByGenre(@RequestParam String genre){
        return ResponseEntity.ok().body(movieService.getAllMoviesByGenre(genre));
    }
}
