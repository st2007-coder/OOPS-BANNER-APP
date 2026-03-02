package com.oops.banner;

import java.util.Scanner;

public class BannerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BannerPrinter printer = new BannerPrinter();

        System.out.println("---- OOPS Banner App ----");
        System.out.println("1. Simple Display");
        System.out.println("2. Basic Banner");
        System.out.println("3. Advanced OOPS Banner");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {

            case 1:
                printer.displaySimple();
                break;

            case 2:
                printer.displayBasicBanner();
                break;

            case 3:
                System.out.print("Enter text (Only O, P, S allowed): ");
                String input = scanner.nextLine();

                if (printer.validateInput(input)) {
                    printer.displayBanner(input.toUpperCase());
                } else {
                    System.out.println("Invalid input! Only O, P, S allowed.");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}