package entities;


import java.util.ArrayList;
import java.util.Set;

public class Collection {

    private ArrayList<SubCollection> subCollection;
    private String nameCollection;
    private String descriptionCollection;
    private Set<String> keywordCollection;

    public Collection(ArrayList<SubCollection> subCollection, String nameCollection, String descriptionCollection, Set<String> keywordCollection) {
        this.subCollection = subCollection;
        this.nameCollection = nameCollection;
        this.descriptionCollection = descriptionCollection;
        this.keywordCollection = keywordCollection;
    }

    public ArrayList<SubCollection> getSubCollection() {
        return subCollection;
    }

    public void setSubCollection(ArrayList<SubCollection> subCollection) {
        this.subCollection = subCollection;
    }

    public String getNameCollection() {
        return nameCollection;
    }

    public void setNameCollection(String nameCollection) {
        this.nameCollection = nameCollection;
    }

    public String getDescriptionCollection() {
        return descriptionCollection;
    }

    public void setDescriptionCollection(String descriptionCollection) {
        this.descriptionCollection = descriptionCollection;
    }

    public Set<String> getKeywordCollection() {
        return keywordCollection;
    }

    public void setKeywordCollection(Set<String> keywordCollection) {
        this.keywordCollection = keywordCollection;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "subCollection=" + subCollection +
                ", nameCollection='" + nameCollection + '\'' +
                ", descriptionCollection='" + descriptionCollection + '\'' +
                ", keywordCollection=" + keywordCollection +
                '}';
    }
}
