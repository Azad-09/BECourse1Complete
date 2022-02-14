package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Author {
    private int authID;
    private String authName;
    private String email;
    @Autowired
    private Book details;

    public Author(int authID, String authName, String email, Book details) {
        this.authID = authID;
        this.authName = authName;
        this.email = email;
        this.details = details;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Book getDetails() {
        return details;
    }

    public void setDetails(Book details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authID=" + authID +
                ", authName='" + authName + '\'' +
                ", email='" + email + '\'' +
                ", details=" + details +
                '}';
    }
}
