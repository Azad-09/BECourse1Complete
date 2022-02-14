package org.movie.model;

public class Movie {
    private int index;
    private String movieName;
    private String director;
    private String releaseYear;
    private String language;

    public Movie() {
    }

    public Movie(int index, String movieName, String director, String releaseYear, String language) {
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

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
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
                ", releaseYear='" + releaseYear + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
