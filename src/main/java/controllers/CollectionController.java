package controllers;

import entities.Collection;
import entities.Product;
import entities.SubCollection;

import java.util.*;

public class CollectionController {

    static ArrayList<Collection> listOfCollection = new ArrayList<>();
    static ArrayList<SubCollection> listOfSubCollection = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    //Create a Collection
    public static void createCollection() {

        String nameCollection;
        String descriptionCollection;
        Set<String> Keyword;

        System.out.println("Collection name: ");
        nameCollection = sc.nextLine();
        System.out.println("Description: ");
        descriptionCollection = sc.nextLine();
        Keyword = keyword();

        Collection collection = new Collection(listOfSubCollection, nameCollection, descriptionCollection, Keyword);
        listOfCollection.add(collection);

        System.out.println("Collection " + nameCollection + " registered successfully!");
    }

    //Create a Keyword
    public static Set<String> keyword() {
        Set<String> Keyword = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Set the Keyword");
            System.out.println("Keyword: " + (i + 1));
            Keyword.add(sc.nextLine());
        }
        return Keyword;
    }

    //Create a SubCollection
    public static void createSubCollection() {

        String nameSubCollection;
        String descriptionSubCollection;
        Set<String> Keyword;

        ArrayList<Product> listOfProducts = new ArrayList<>();

        System.out.println("In what collection do you want to add this Sub-Collection?: ");
        String collectionName = sc.nextLine();
        if (validateCollections(collectionName)) {
            System.out.println("Sub-Collection name: ");
            nameSubCollection = sc.nextLine();
            System.out.println("Description: ");
            descriptionSubCollection = sc.nextLine();
            Keyword = keyword();
            System.out.println("Sub-Collection " + nameSubCollection + " registered successfully!");
            SubCollection subCollection = new SubCollection(nameSubCollection, descriptionSubCollection, Keyword, listOfProducts);
            listOfSubCollection.add(subCollection);
            for (Collection collection : listOfCollection) {
                if (collection.getNameCollection().equals(nameSubCollection)) {
                    ArrayList<SubCollection> sCollections = collection.getSubCollection();
                    sCollections.add(subCollection);
                    collection.setSubCollection(sCollections);
                    System.out.println("  Sub-Collection Successfully Registered!!!  ");
                }
            }

        } else {
            System.out.println("This Collection doesn't exist.\nLet's Create a Collection");
            createCollection();
        }
    }

    //Validate Collections
    public static Boolean validateCollections(String nameCollection) {
        // takes the String name, search in a ForEach loop of sub-collections and sees if another sub-collection have the same name.
        for (Collection collection : listOfCollection)
            if (collection.getNameCollection().equalsIgnoreCase(nameCollection)) {
                return true;
            }


        return false;
    }

    //Validate Sub-Collections
    public static Boolean validateSubCollections(String nameCollection) {
        // takes the String name, search in a ForEach loop of sub-collections and sees if another sub-collection have the same name.
        for (SubCollection subCollection : listOfSubCollection)
            if (subCollection.getNameSubCollection().equalsIgnoreCase(nameCollection)) {
                return true;
            }


        return false;
    }

    //Set a Product in a Sub-Collections
    public static void setProductInSubCollection(String SubCollectionName, Product product) {
        for (SubCollection scollection : listOfSubCollection) {
            if (scollection.getNameSubCollection().equalsIgnoreCase(SubCollectionName)) {
                ArrayList<Product> products = scollection.getProduct();
                products.add(product);
                scollection.setProduct(products);
            }
        }
    }

    //Show Sub-Collections
    public List<String> showSubCollections() {
        List<String> subCollections = new ArrayList<>();
        for (SubCollection sCollections : listOfSubCollection) {
            subCollections.add(sCollections.getNameSubCollection());

        }
        return subCollections;
    }

    //Show Collections
    public static void showCollections() {
        ArrayList<String> ListCollections = new ArrayList<>();
        for (Collection Collection : listOfCollection) {
            for (SubCollection subCollection : Collection.getSubCollection()
            ) {
                ListCollections.add("Collection: " + Collection.getNameCollection() + System.lineSeparator() + subCollection.getNameSubCollection());

            }
        }
        if (ListCollections.size() > 0) {
            System.out.println(ListCollections);
        } else {
            System.out.println("Not Found");
        }

    }


}





