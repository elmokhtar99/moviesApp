package com.transperfect.movieapplication.services;

import com.transperfect.movieapplication.models.Movie;

import java.util.List;

public interface IMovieService {
    List<Movie> getAllMovies();
    List<Movie> getAllMoviesByGenre(String genre);
}
