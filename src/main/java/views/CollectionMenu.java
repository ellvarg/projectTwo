package views;

import java.util.Scanner;

public class CollectionMenu {

    //MENU
    public static void CollectionManagementMenu() {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 5) {
            menu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("1 - Create new Collection;");

                    break;

                case 2:
                    System.out.println("2 - Create new sub-collection");

                    break;

                case 3:
                    System.out.println("3 - Search for Product");

                    break;

                case 4:
                    System.out.println("4 - List for Products in a Collection");

                    break;

                case 5:
                    System.out.println("You're backing to main menu.");
                    MainMenu.mainMenu();

                default:
                    System.out.println("Choose a valid option");
            }
        }


        sc.close();
    }

    //Menu Options Printer
    public static void menu() {

        System.out.println("");
        System.out.println("1 - Create new Collection;");
        System.out.println("2 - Create new sub-collection");
        System.out.println("3 - Search for Product");
        System.out.println("4 - List for Products in a Collection");
        System.out.println("5 - Back to Main Menu");
    }

}

