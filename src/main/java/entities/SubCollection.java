package entities;

import java.util.*;
import java.util.stream.Collectors;

public final class SubCollection extends Collection{

    Set<Product> products = new HashSet<>();
    public Set<SubCollection> subCollectionList = new HashSet<>();


    public SubCollection(String name, String description, Set<String> keywords, MainCollection mainCollection) {
        super(name, description, keywords);
    }

    public SubCollection() {
    }

    public Set<SubCollection> getSubCollectionList() {
        return subCollectionList;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void adicionar(Product product) {
        products.add(product);
    }

    public SubCollection create(SubCollection subCollection){
        try{
            subCollectionList.add(subCollection);
            return subCollection;
        }catch (Exception e){
            System.out.println("Not creating Sub Collection");
            return null;
        }
    }

    public List<SubCollection> listAll(){
        return subCollectionList.stream().collect(Collectors.toList());
    }

    public Set<Product> findProductByName(String name){
        Product pro = new Product();
        return pro.findByName(name);

    }

    public List<Product> listAllProducts(){
        return products.stream().collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "SubCollection" ;
    }
}