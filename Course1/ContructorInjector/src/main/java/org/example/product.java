package org.example;

public class product {
    private int prodID;
    private String prodName;
    private int cost;

    public product(int prodID, String prodName, int cost) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "product{" +
                "prodID=" + prodID +
                ", prodName='" + prodName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
