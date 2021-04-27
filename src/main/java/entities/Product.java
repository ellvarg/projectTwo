package entities;

import java.util.List;


public class Product {

    public String name;
    public double price;
    public String description;
    public int quantity;
    public List<Image> images;

    public Product(String name, double price, String description, Integer quantity) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }
}



