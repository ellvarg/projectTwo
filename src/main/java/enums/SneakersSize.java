package enums;

public enum SneakersSize {

    _6("6"), _6_5("6.5"),  _7("7"), _7_5("7.5"), _8("8"), _8_5("8.5"), _9("9"), _9_5("9.5"), _10("10"), _11_5("11.5"), _11("11");

    private final String SneakersSize;

    //Constructors
    SneakersSize(String SneakersSize) {
        this.SneakersSize = SneakersSize;
    }

    //Getters
    public String getSneakersSize() {
        return SneakersSize;
    }
}