package entities;

import java.util.List;
import java.util.Set;

public abstract class Collection {

    String name;
    String description;
    Set<String> keywords;

    public Collection(String name, String description, Set<String> keywords) {
        this.name = name;
        this.description = description;
        this.keywords = keywords;
    }

    public Collection() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Set<String> getKeywords() {
        return keywords;
    }
}