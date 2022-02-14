package org.example;

public class address {
    private String laneNo;
    private String city;
    private String state;
    private String country;

    public address(String laneNo, String city, String state, String country) {
        this.laneNo = laneNo;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getLaneNo() {
        return laneNo;
    }

    public void setLaneNo(String laneNo) {
        this.laneNo = laneNo;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "address{" +
                "laneNo='" + laneNo + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
