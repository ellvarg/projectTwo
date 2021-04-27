package entities;

import enums.Activity;
import enums.Color;
import enums.Gender;
import enums.SneakersSize;

public class Sneakers extends Product{

    Color color;
    Gender gender;
    Activity activity;
    SneakersSize size;


    public Sneakers(String name, double price, String description, int quantity, Collection collection) {
        super(name, price, description, quantity, collection);
    }
}