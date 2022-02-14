package org.example;

public class Book {
    private String bookID;
    private String bookName;
    private String bookGenre;

    public Book(String bookID, String bookName, String bookGenre) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookGenre = bookGenre;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID='" + bookID + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookGenre='" + bookGenre + '\'' +
                '}';
    }
}
