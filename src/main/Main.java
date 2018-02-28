package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> types = new ArrayList<>();
        types.add("Bitcoin");
        types.add("Booty");
        types.add("Doge");
        types.add("Obama");
        types.add("Sanic");
        types.add("Shrek");
        types.add("Yee");

        System.out.println("~WELCOME TO ASCII ART SHOW~");
        System.out.println(" ========================= ");
        System.out.println("Select an option (name): ");
        int count = 1;
        for (String type : types)
            System.out.println(count + ". " + type);
        String option = scanner.next().toLowerCase();




    }
}
