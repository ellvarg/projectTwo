package entities;

import enums.Color;
import enums.Gender;
import enums.TShirtSize;
import enums.Sleeve;

public class TShirt extends Product{

    Color color;
    Gender gender;
    TShirtSize size;
    Sleeve sleeve;

    public TShirt(String name, double price, String description, int quantity) {
        super(name, price, description, quantity);
    }
}