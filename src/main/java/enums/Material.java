package enums;

//Added but not implemented

public enum Material {

    Jeans("Jeans"), Fur("Fur"), Leather("Leather"), Flannel("Flannel"), Nylon("Nylon ");

    private final String Material;

    //Constructors
    Material(String material) {
        Material = material;
    }

    //Getters
    public String getMaterial() {
        return Material;
    }
}