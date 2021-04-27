package enums;

public enum Color {

    Black("Black"), White("White"), Red("Red"), Blue("Blue"), Green("Green");

    private final String Color;

    //Constructors
    Color(String color) {
        Color = color;
    }

    //Getters
    public String getColor() {
        return Color;
    }
}