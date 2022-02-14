package org.example;

public class Product {
    private int prodId;
    private String prodName;
    private int cost;

    public Product(int prodId, String prodName, int cost) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.cost = cost;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
