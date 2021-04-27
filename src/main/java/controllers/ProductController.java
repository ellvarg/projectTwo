package controllers;

import entities.Product;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductController {

    Scanner sc = new Scanner(System.in);

    public static ArrayList<Product> listOfProducts = null;

    //Saving a product and adding it to a list
    public static void saveProduct() {

        String name;
        Double price = null;
        String description;
        int quantity = 0;
        String category;

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        name = sc.nextLine();

        //Capture Exception if user enters text instead of number
        try {
            System.out.print("Price: ");
            price = sc.nextDouble();
        } catch (InputMismatchException i) {
            System.out.println("Only number are valids!");
            saveProduct();
        }

        System.out.print("Description: ");
        sc.nextLine();
        description = sc.nextLine();

        //Capture Exception if user enters text instead of number
        try {
            System.out.print("Quantity in stock: ");
            quantity = sc.nextInt();
        } catch (InputMismatchException i) {
            System.out.println("Only number are valids!");
            saveProduct();
        }


        //Cria um produto
        Product product = new Product(name, price, description, quantity);
        //Adiciona produto na lista
        listOfProducts.add(product);

        System.out.println();
        System.out.println("Product " + name + " registered successfully!");

    }

    //Scrolling through the product list and printing the name
    public static void listProducts() {

        for (int i = 0; i < listOfProducts.size(); i++) {
            System.out.println(listOfProducts.get(i).name);
        }
    }

    //Scrolling through the list of products and checking if you have a product with the name passed by the user
    public static void searchProduct(String nameOfProduct) {

        for (int i = 0; i < listOfProducts.size(); i++) {
            if (listOfProducts.get(i).getName().equalsIgnoreCase(nameOfProduct)) {
                System.out.println();
                System.out.println("Price: " + listOfProducts.get(i).getPrice());
                System.out.println("Description: " + listOfProducts.get(i).getDescription());

            }

        }


    }
}