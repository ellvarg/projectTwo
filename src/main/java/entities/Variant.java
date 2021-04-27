package entities;

import java.util.Set;

public class Variant extends Product {

    public Variant(String name, Double price, String description, Integer quantity, SubCollection subCollection,
                   Set<Image> images) {
        super(name, price, description, quantity, subCollection, images);
    }

}
