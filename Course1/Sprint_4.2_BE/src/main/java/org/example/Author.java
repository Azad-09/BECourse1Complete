package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Author {
    private int authID;
    private String authName;
    private String email;


    public Author(int authID, String authName, String email) {
        this.authID = authID;
        this.authName = authName;
        this.email = email;

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


    @Override
    public String toString() {
        return "Author{" +
                "authID=" + authID +
                ", authName='" + authName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
