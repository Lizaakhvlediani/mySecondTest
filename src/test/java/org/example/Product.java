package org.example;

public class Product {
    private double price;
    private double discount;

    public Product(double price, double discount) {
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public double getPriceAfterDiscount() {
        return price - discount;
    }

}