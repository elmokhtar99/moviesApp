package com.transperfect.movieapplication.services;

import com.transperfect.movieapplication.models.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService implements IMovieService{
    public MovieService() {
        super();
    }
    @Override
    public List<Movie> getAllMovies(){
        List<Movie> movies = new ArrayList<>();
        Movie movie1 = Movie
                .builder()
                .id(1L)
                .title("The Shawshank Redemption")
                .genre("Drama")
                .releaseYear(1994)
                .director("Frank Darabont")
                .build();
        Movie movie2 = Movie
                .builder()
                .id(2L)
                .title("The Godfather")
                .genre("Drama")
                .releaseYear(1972)
                .director("Francis Ford Coppola")
                .build();

        Movie movie3 = Movie
                .builder()
                .id(3L)
                .title("The Dark Knight")
                .genre("Action")
                .releaseYear(2008)
                .director("Christopher Nolan")
                .build();

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        return movies;
    }

    @Override
    public List<Movie> getAllMoviesByGenre(String genre) {
        return this.getAllMovies()
                .stream()
                .filter(movie -> movie.getGenre().compareTo(genre)==0)
                .collect(Collectors.toList());
    }
}
