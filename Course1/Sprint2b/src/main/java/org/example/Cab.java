package org.example;

public class Cab {
    private String cabNo;
    private String brand;
    private String color;

    public Cab(String cabNo, String brand, String color) {
        this.cabNo = cabNo;
        this.brand = brand;
        this.color = color;
    }

    public String getCabNo() {
        return cabNo;
    }

    public void setCabNo(String cabNo) {
        this.cabNo = cabNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cab{" +
                "cabNo=" + cabNo +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
