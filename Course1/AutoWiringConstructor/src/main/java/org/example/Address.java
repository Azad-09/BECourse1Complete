package org.example;



public class Address {
    private String houseNo;
    private String city;
    private String state;
    private int pinCode;
    private String country;


    public Address(String houseNo, String city, String state, int pinCode, String country) {
        this.houseNo = houseNo;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.country = country;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                ", country='" + country + '\'' +
                '}';
    }
}
