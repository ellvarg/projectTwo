package entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class MainCollection extends Collection {

    Set<SubCollection> subCollection;
    Set<MainCollection> mainCollection = new HashSet<>();

    public MainCollection(String name, String description, Set<String> keywords) {
        super(name, description, keywords);
    }

    public MainCollection() {
    }

    public MainCollection create(MainCollection mainCollection) {
        try {
            mainCollection.add(mainCollection);
            return mainCollection;
        } catch (Exception e) {
            System.out.println("Not creating Main Collection");
            return null;
        }
    }

    public List<MainCollection> listAll() {
        return mainCollection.stream().collect(Collectors.toList());
    }


}