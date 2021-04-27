package views;


import controllers.ProductController;

import java.util.Scanner;

public class ProductMenu {

    public static void ProductManagementMenu() {


        Scanner sc = new Scanner(System.in);

        //MENU
        int opcao = 0;
        int produtoption = 0;
        while (opcao != 4) {
            menu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Create a new Product:");
                    ProductController.saveProduct();
                    break;

                case 2:
                    System.out.println("List of products: ");
                    ProductController.listProducts();
                    break;

                case 3:
                    System.out.println("Enter the product name:  ");
                    String nameOfProduct = sc.next();
                    ProductController.searchProduct(nameOfProduct);
                    break;

                case 4:
                    System.out.println("You're backing to main menu.");
                    MainMenu.mainMenu();
                    break;

                default:
                    System.out.println("Choose a valid option");
            }
        }


        sc.close();
    }

    //Menu Options Printer
    public static void menu() {

        System.out.println("");
        System.out.println("1 - Save a new product");
        System.out.println("2 - List all products");
        System.out.println("3 - Search a specific product");
        System.out.println("4 - Back to main menu");
    }

}

