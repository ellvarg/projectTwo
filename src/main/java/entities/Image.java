package entities;

//Added but not implemented

public class Image {

    private String name;
    private final String size = "600x400";
    private final String extension = ".jpg";
    private final String path = ".../User/Dowload...";

    public Image(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public String getExtension() {
        return extension;
    }

    public String getPath() {
        return path;
    }
}