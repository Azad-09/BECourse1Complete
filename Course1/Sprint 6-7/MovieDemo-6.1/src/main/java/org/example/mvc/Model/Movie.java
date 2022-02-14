package org.example.mvc.Model;

public class Movie {
    private String MovieID;
    private String Name;
    private String Category;
    private int ticketPrice;

    public Movie(String movieID, String name, String category, int ticketPrice) {
        MovieID = movieID;
        Name = name;
        Category = category;
        this.ticketPrice = ticketPrice;
    }

    public Movie() {
    }

    public String getMovieID() {
        return MovieID;
    }

    public void setMovieID(String movieID) {
        MovieID = movieID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "MovieID='" + MovieID + '\'' +
                ", Name='" + Name + '\'' +
                ", Category='" + Category + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
