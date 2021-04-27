package entities;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Product {

    public String name;
    public double price;
    public String description;
    public int quantity;
    /* Collection collection;
     List<Image> images;

    Set<Product> products = new HashSet<>();
    SubCollection subCollection = new SubCollection();


   public Product(String name, double price, String description, int quantity, Collection collection) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.collection = collection;
    }*/

    public Product() {
    }

    public Product(String name, Double price, String description, int quantity) {
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
  /* public Collection getCollection() {
        return collection;
    }

    public List<Image> getImages() {
        return images;
    }

    */


