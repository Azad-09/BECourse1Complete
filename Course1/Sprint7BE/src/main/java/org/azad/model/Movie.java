package org.azad.model;

import javax.persistence.*;

@Entity
@Table(name = "Movie")
public class Movie {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int index;
    @Column(name = "Movie")
 private String movieName;
    @Column(name = "Director")
 private String director;
    @Column(name = "Release")
 private int releaseYear;
    @Column(name = "Language")
 private String language;

    public Movie() {
    }

    public Movie(int index, String movieName, String director, int releaseYear, String language) {
        this.index = index;
        this.movieName = movieName;
        this.director = director;
        this.releaseYear = releaseYear;
        this.language = language;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "index=" + index +
                ", movieName='" + movieName + '\'' +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                ", language='" + language + '\'' +
                '}';
    }
}
