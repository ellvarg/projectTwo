package entities;

import enums.*;

public class Pants extends Product {

    Color color;
    Gender gender;
    Activity activity;
    Material material;
    PantsSize size;


    public Pants(String name, double price, String description, int quantity, Collection collection) {
        super(name, price, description, quantity, collection);
    }
}