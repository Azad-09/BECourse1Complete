package org.example;

public class cab {
    private int cabNo;
    private String cabName;
    private String cabColor;

    public cab(int cabNo, String cabName, String cabColor) {
        this.cabNo = cabNo;
        this.cabName = cabName;
        this.cabColor = cabColor;
    }

    @Override
    public String toString() {
        return "cab{" +
                "cabNo=" + cabNo +
                ", cabName='" + cabName + '\'' +
                ", cabColor='" + cabColor + '\'' +
                '}';
    }
}
