package com.ecommerce.model;

public class Book {

    private int id;
    private String title;
    private String author;
    private double price;
    private int stock;

    public Book(int id, String title, String author, double price, int stock) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String toString() {
        return id + " " + title + " " + author + " " + price + " " + stock;
    }
}
