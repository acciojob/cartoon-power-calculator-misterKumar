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
    }

    public static void addCartoon(Scanner scanner, List<Cartoon> cartoons, Set<String> uniqueNames) {
        // your code goes here
    }

    public static void displayCartoons(List<Cartoon> cartoons) {
        // your code goes here
    }

    public static void calculateCartoonPower(List<Cartoon> cartoons) {
        // your code goes here
    }
}
