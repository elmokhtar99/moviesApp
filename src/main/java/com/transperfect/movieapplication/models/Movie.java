package com.transperfect.movieapplication.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie
{
    private Long id;
    private String title;
    private String genre;
    private int releaseYear;
    private String director;
}