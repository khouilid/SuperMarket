package com.khouilid;

public class Chario {

    private int quantity;
    private double totalePrice;

    public double getTotalePrice() {
        return totalePrice;
    }


    public int getQuantity() {
        return quantity;
    }


    public Chario(int quantity, double price) {

        this.quantity = quantity;
        this.totalePrice = quantity * price;
    }
}
