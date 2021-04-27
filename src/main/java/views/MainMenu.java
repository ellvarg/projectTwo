package views;

import java.util.Scanner;

public class MainMenu {

    //MENU
    public static void mainMenu() {

        Scanner sc = new Scanner(System.in);

        int option = 0;
        while (option != 3) {
            menu();
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Product Management");
                    ProductMenu.ProductManagementMenu();
                    break;

                case 2:
                    System.out.println("Collection Management");
                    CollectionMenu.CollectionManagementMenu();
                    break;

                case 3:
                    System.out.println("You're leaving, bye!");
                    System.exit(0);
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
        System.out.println("1 - Product Management");
        System.out.println("2 - Collection Management");
        System.out.println("3 - exit.");

    }
}