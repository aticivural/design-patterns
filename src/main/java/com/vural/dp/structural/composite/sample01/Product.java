package com.vural.dp.structural.composite.sample01;

public class Product extends CatalogComponent {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Product name: " + name + " Price: " + price);
    }
}
