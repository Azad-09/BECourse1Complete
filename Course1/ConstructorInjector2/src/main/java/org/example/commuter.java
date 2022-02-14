package org.example;

public class commuter {
    private String comName;
    private String comNumber;
    private cab details;


    public commuter(String comName, String comNumber, cab details) {
        this.comName = comName;
        this.comNumber = comNumber;
        this.details = details;
    }

    @Override
    public String toString() {
        return "commuter{" +
                "comName='" + comName + '\'' +
                ", comNumber='" + comNumber + '\'' +
                ", details=" + details +
                '}';
    }
}
