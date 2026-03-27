package com.ComaparatorMiniProject;

import java.util.Arrays;
import java.util.Scanner;

public class UserProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How Many Mobiles do you want to add: ");
        int size = sc.nextInt();
        sc.nextLine(); // clear buffer

        Mobile[] m = new Mobile[size];

        System.out.println("Enter the mobile details:");

        for (int i = 0; i < m.length; i++) {
            System.out.println("\nMobile " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("RAM (GB): ");
            int ram = sc.nextInt();

            System.out.print("ROM (GB): ");
            int rom = sc.nextInt();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // clear buffer

            System.out.print("Color: ");
            String color = sc.nextLine();

            // ✅ Correct constructor order
            m[i] = new Mobile(name, ram, rom, price, color);
        }

        System.out.println("\nChoose Sorting Option:");
        System.out.println("1. Sort by Name");
        System.out.println("2. Sort by Price (Ascending)");
        System.out.println("3. Sort by Price (Descending)");
        System.out.println("4. Sort by RAM (Ascending)");
        System.out.println("5. Sort by RAM (Descending)");
        System.out.println("6. Sort by ROM (Ascending)");
        System.out.println("7. Sort by ROM (Descending)");
        System.out.println("8. Sort by Color");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Arrays.sort(m, new SortByName());
                break;
            case 2:
                Arrays.sort(m, new SortByPrice());
                break;
            case 3:
                Arrays.sort(m, new SortByPriceDec());
                break;
            case 4:
                Arrays.sort(m, new SortByRam());
                break;
            case 5:
                Arrays.sort(m, new SortByRamDec());
                break;
            case 6:
                Arrays.sort(m, new SortByRom());
                break;
            case 7:
                Arrays.sort(m, new SortByRomDec());
                break;
            case 8:
                Arrays.sort(m, new SortByColor());
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        System.out.println("\nSorted Mobiles:");
        for (Mobile mobile : m) {
            System.out.println(mobile);
        }

        sc.close();
    }
}