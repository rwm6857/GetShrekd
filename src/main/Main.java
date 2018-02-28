package main;


import art.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class and function to run the ASCII Art Show
 *
 * @author Ryan W. Moore (rwm6857)
 */
public class Main {
    /**
     * main function
     *
     * @param args not used
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> types = new ArrayList<>();
        types.add("Bitcoin");
        types.add("Booty");
        types.add("Doge");
        types.add("Obama");
        types.add("Sanic");
        types.add("Shrek");
        types.add("Soviet");
        types.add("Yee");

        System.out.println("   ___   _________________                 \n" +
                "  / _ | / __/ ___/  _/  _/                 \n" +
                " / __ |_\\ \\/ /___/ /_/ /                   \n" +
                "/_/_|_/___/\\___/___/___/__ ______ _      __\n" +
                "  / _ | / _ \\/_  __/ __/ // / __ \\ | /| / /\n" +
                " / __ |/ , _/ / / _\\ \\/ _  / /_/ / |/ |/ / \n" +
                "/_/ |_/_/|_| /_/ /___/_//_/\\____/|__/|__/  \n" +
                "                                           ");
        System.out.println("Type 'q' to quit anytime");
        System.out.println("Select an option (name): ");
        int count = 1;
        for (String type : types) {
            System.out.println(count + ". " + type);
            count++;
        }
        String option = scanner.next().toLowerCase();
        while (!"q".equals(option)) {
            switch (option) {
                case "bitcoin":
                    System.out.println(new Bitcoin().getArt());
                    break;
                case "booty":
                    System.out.println(new Booty().getArt());
                    break;
                case "doge":
                    System.out.println(new Doge().getArt());
                    break;
                case "obama":
                    System.out.println(new Obama().getArt());
                    break;
                case "sanic":
                    System.out.println(new Sanic().getArt());
                    break;
                case "shrek":
                    System.out.println(new Shrek().getArt());
                    break;
                case "yee":
                    System.out.println(new Yee().getArt());
                    break;
                case "soviet":
                    System.out.println(new Soviet().getArt());
                    break;
                case "o":
                    count = 1;
                    for (String type : types) {
                        System.out.println(count + ". " + type);
                        count++;
                    }
                    break;
                default:
                    System.out.println("Invalid option");
            }
            System.out.println("Next option ('o' for options):");
            option = scanner.next().toLowerCase();
        }
        System.exit(420);
    }
}
