package org.example;

import org.springframework.beans.factory.annotation.Autowired;


public class Customer {
    private int custID;
    private String custName;
    private String custNumber;
    private String email;
    private Address details;

    @Autowired
    public Customer(int custID, String custName, String custNumber, String email, Address details) {
        this.custID = custID;
        this.custName = custName;
        this.custNumber = custNumber;
        this.email = email;
        this.details = details;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustNumber() {
        return custNumber;
    }

    public void setCustNumber(String custNumber) {
        this.custNumber = custNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getDetails() {
        return details;
    }

    public void setDetails(Address details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custID=" + custID +
                ", custName='" + custName + '\'' +
                ", custNumber='" + custNumber + '\'' +
                ", email='" + email + '\'' +
                ", details=" + details +
                '}';
    }
}
