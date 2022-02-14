package model;

public class Author {
    private int authID;
    private String authName;
    private String bookName;
    private int cost;

    public Author() {
    }

    public Author(int authID, String authName, String bookName, int cost) {
        this.authID = authID;
        this.authName = authName;
        this.bookName = bookName;
        this.cost = cost;
    }

    public int getAuthID() {
        return authID;
    }

    public void setAuthID(int authID) {
        this.authID = authID;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authID=" + authID +
                ", authName='" + authName + '\'' +
                ", bookName='" + bookName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
