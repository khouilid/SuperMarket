package com.khouilid;

public class Articles {
    private boolean sold;
    private String name;
    private double price;

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    public String isSold() {
        if (sold) return "Sold";
        return "pas de sold";
    }


    public Articles(String name, double price, boolean sold) {
        this.name = name;
        this.price = price;
        this.sold = sold;
    }


}
