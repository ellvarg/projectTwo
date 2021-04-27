package enums;

//Added but not implemented

public enum TShirtSize {

    XS("XS"), S("S"), M("M"), L("L"), XL("XL"), XLL("XLL"), XLLL("XLLL");

    private final String TShirtSize ;

    //Constructors
    TShirtSize (String TShirtSize ) {
        this.TShirtSize  = TShirtSize ;
    }

    //Getters
    public String getTShirtSize () {
        return TShirtSize ;
    }
}