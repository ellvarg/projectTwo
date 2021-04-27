package enums;

public enum Sleeve {

    Long("Long"), Short("Short");

    private final String Sleeve;

    //Constructors
    Sleeve(String Sleeve) {
        this.Sleeve = Sleeve;
    }

    //Getters
    public String getSleeve() {
        return Sleeve;
    }
}