package enums;

public enum Activity {

    Casual("Casual"), Running("Running"), Hiking("Hiking"), Soccer("Soccer"), Basketball("Basketball"), Baseball ("Baseball");

    private final String Activity;

    //Constructors
    Activity(String activity) {
        Activity = activity;
    }

    //Getters
    public String getActivity() {
        return Activity;
    }

}