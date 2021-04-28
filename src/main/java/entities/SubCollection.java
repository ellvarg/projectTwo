package entities;

import java.util.ArrayList;
import java.util.Set;

public class SubCollection {

    public String nameSubCollection;
    public String descriptionSubCollection;
    public Set<String> keywordSubCollection;
    public ArrayList<Product> Product;


    public SubCollection(String nameSubCollection, String descriptionSubCollection, Set<String> keywordSubCollection, ArrayList<entities.Product> product) {
        this.nameSubCollection = nameSubCollection;
        this.descriptionSubCollection = descriptionSubCollection;
        this.keywordSubCollection = keywordSubCollection;
        Product = product;
    }

    public String getNameSubCollection() {
        return nameSubCollection;
    }

    public void setNameSubCollection(String nameSubCollection) {
        this.nameSubCollection = nameSubCollection;
    }

    public String getDescriptionSubCollection() {
        return descriptionSubCollection;
    }

    public void setDescriptionSubCollection(String descriptionSubCollection) {
        this.descriptionSubCollection = descriptionSubCollection;
    }

    public Set<String> getKeywordSubCollection() {
        return keywordSubCollection;
    }

    public void setKeywordSubCollection(Set<String> keywordSubCollection) {
        this.keywordSubCollection = keywordSubCollection;
    }

    public ArrayList<entities.Product> getProduct() {
        return Product;
    }

    public void setProduct(ArrayList<entities.Product> product) {
        Product = product;
    }

    @Override
    public String toString() {
        return "SubCollection{" +
                "nameSubCollection='" + nameSubCollection + '\'' +
                ", descriptionSubCollection='" + descriptionSubCollection + '\'' +
                ", keywordSubCollection=" + keywordSubCollection +
                ", Product=" + Product +
                '}';
    }
}

