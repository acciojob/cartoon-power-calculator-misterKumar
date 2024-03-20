package com.driver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CartoonPowerCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cartoon> cartoons = new ArrayList<Cartoon>();
        Set<String> uniqueNames = new HashSet<String>();

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addCartoon(scanner, cartoons, uniqueNames);
                    break;
                case 2:
                    displayCartoons(cartoons);
                    break;
                case 3:
                    calculateCartoonPower(cartoons);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    public static void printMenu() {
        // your code goes here
        System.out.println("\nChoose an option:");
        System.out.println("1. Add Cartoon");
        System.out.println("2. Display Cartoons");
        System.out.println("3. Calculate Cartoon Power");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void addCartoon(Scanner scanner, List<Cartoon> cartoons, Set<String> uniqueNames) {
        // your code goes here
        System.out.print("Enter cartoon name: ");
        String name = scanner.next();
        if (uniqueNames.contains(name)) {
            System.out.println("Cartoon with the same name already exists. Please enter a unique name.");
            return;
        }
        uniqueNames.add(name);
        System.out.print("Enter cartoon power: ");
        int power = scanner.nextInt();
        Cartoon cartoon = new Cartoon(name, power);
        cartoons.add(cartoon);
        System.out.println(name + " added.");
    }

    public static void displayCartoons(List<Cartoon> cartoons) {
        // your code goes here
        System.out.println("\nCartoons:");
        for (Cartoon cartoon : cartoons) {
            System.out.println(cartoon);
        }
    }

    public static void calculateCartoonPower(List<Cartoon> cartoons) {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the criteria (even/odd): ");
        String criteria = scanner.next();
        int totalPower = 0;
        for (Cartoon cartoon : cartoons) {
            if (criteria.equalsIgnoreCase("even") && cartoon.getPower() % 2 == 0) {
                totalPower += cartoon.getPower();
            } else if (criteria.equalsIgnoreCase("odd") && cartoon.getPower() % 2 != 0) {
                totalPower += cartoon.getPower();
            }
        }
        System.out.println("Total power of cartoons with " + criteria + " power: " + totalPower);
    }
}
