package Controllers;

import entities.MainCollection;
import entities.SubCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionController {
    static Scanner input = new Scanner(System.in);

    public static void mainCollection() {


        MainCollection mc = new MainCollection();
        Set<String> keywords = new HashSet<String>();
        keywords.add(input.nextLine());
        keywords.add(input.nextLine());
        keywords.add(input.nextLine());


        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("Description: ");
        String description = input.nextLine();

        Set<String> keywordsList = new HashSet<String>();
        System.out.println("Keywords: ");
        keywordsList.add(input.nextLine());
        keywordsList.add(input.nextLine());
        keywordsList.add(input.nextLine());

        mc.create(new MainCollection(name, description, keywordsList));

        for (MainCollection main : mc.listAll()) {
            System.out.println("MAIN COLLECTION: " + main.getName());
            System.out.println("MAIN COLLECTION: " + main.getDescription());
        }

    }


    public static void subCollection() {

        SubCollection sc = new SubCollection();
        Set<String> keywords = new HashSet<String>();
        keywords.add(input.nextLine());
        keywords.add(input.nextLine());
        keywords.add(input.nextLine());


        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("Description: ");

        String description = input.nextLine();

        Set<String> keywordsList = new HashSet<String>();
        System.out.println("Keywords: ");
        keywordsList.add(input.nextLine());
        keywordsList.add(input.nextLine());
        keywordsList.add(input.nextLine());

        MainCollection main = new MainCollection(name, description, keywords);
        sc.create(new SubCollection(name, description, keywordsList, main));

        System.out.println("MAIN COLLECTION: " + main.getName());
        for (SubCollection sub : sc.listAll()) {
            System.out.println("SUB COLLECTION: " + sub.getName());
            System.out.println("SUB COLLECTION: " + sub.getDescription());
        }

    }
}
