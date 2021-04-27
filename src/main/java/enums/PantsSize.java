package enums;

//Added but not implemented

public enum PantsSize {

    _36("36"), _38("38"), _40("40"), _42("42"), _44("44"), _46("46"), _48("48"), _50("50");

    private final String PantsSize;

    private PantsSize(String PantsSize) {
        this.PantsSize = PantsSize;
    }

    public String getPantsSize() {
        return PantsSize;
    }

}