package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue
    private int bookID;
    @Column(name = "Name")
    private String bookName;
    @Column(name = "Author")
    private String authorName;
    @Column(name = "Editor")
    private String editorName;
    @Column(name = "MRP")
    private int cost;


    public Book(int bookID, String bookName, String authorName, String editorName, int cost) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.authorName = authorName;
        this.editorName = editorName;
        this.cost = cost;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName(String mossad) {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName(String s) {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getEditorName(String mammen_mathew) {
        return editorName;
    }

    public void setEditorName(String editorName) {
        this.editorName = editorName;
    }

    public int getCost(int i) {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Book() {
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", editorName='" + editorName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
