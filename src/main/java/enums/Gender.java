package enums;

//Added but not implemented

public enum Gender {

    Masculino("Masculino"), Feminino("Feminino");

    private final String Gender;

    //Constructors
    Gender(String gender) {
        Gender = gender;
    }

    //Getters
    public String getGender() {
        return Gender;
    }
}