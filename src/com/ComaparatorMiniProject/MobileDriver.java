package com.ComaparatorMiniProject;

import java.util.Arrays;
import java.util.Scanner;

public class MobileDriver {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean r = true;
        Mobile[] m = null;

        do {
            System.out.println("\n1.Add\n2.Sort\n3.Display\n4.Exit");
            int n = s.nextInt();
            s.nextLine(); // clear buffer

            switch (n) {

                case 1: {
                    System.out.println("How Many Mobiles Do you want to add");
                    int num = s.nextInt();
                    s.nextLine(); // clear buffer

                    m = new Mobile[num];

                    for (int i = 0; i < num; i++) {
                        System.out.println("\nEnter Mobile name,ram,rom,price,Color");

                        System.out.print("Name: ");
                        String name = s.nextLine();

                        System.out.print("RAM: ");
                        int ram = s.nextInt();

                        System.out.print("ROM: ");
                        int rom = s.nextInt();

                        System.out.print("Price: ");
                        double price = s.nextDouble();
                        s.nextLine(); // clear buffer

                        System.out.print("Color: ");
                        String color = s.nextLine();

                        m[i] = new Mobile(name, ram, rom, price, color);
                    }
                    break;
                }

                case 2: {

                    if (m == null) {
                        System.out.println("Please add mobiles first.");
                        break;
                    }

                    System.out.println("1.Sort By Name");
                    System.out.println("2.Sort By Price(High to Low)");
                    System.out.println("3.Sort By Price(Low to High)");
                    System.out.println("4.Sort By RAM(High to Low)");
                    System.out.println("5.Sort By RAM(Low to High)");
                    System.out.println("6.Sort By ROM(High to Low)");
                    System.out.println("7.Sort By ROM(Low to High)");
                    System.out.println("8.Sort By Color");

                    int num = s.nextInt();

                    if (num == 1) {
                        Arrays.sort(m, new SortByName());
                    } else if (num == 2) {
                        Arrays.sort(m, new SortByPrice());
                    } else if (num == 3) {
                        Arrays.sort(m, new SortByPriceDec());
                    } else if (num == 4) {
                        Arrays.sort(m, new SortByRam());
                    } else if (num == 5) {
                        Arrays.sort(m, new SortByRamDec());
                    } else if (num == 6) {
                        Arrays.sort(m, new SortByRom());
                    } else if (num == 7) {
                        Arrays.sort(m, new SortByRomDec());
                    } else if (num == 8) {
                        Arrays.sort(m, new SortByColor());
                    } else {
                        System.out.println("Invalid choice");
                        break;
                    }

                    System.out.println("\nSorted Mobiles:");
                    for (Mobile mobile : m)
                        System.out.println(mobile);

                    break;
                }

                case 3: {

                    if (m == null) {
                        System.out.println("Please add mobiles first.");
                        break;
                    }

                    System.out.println("\nMobile List:");
                    for (Mobile mobile : m)
                        System.out.println(mobile);

                    break;
                }

                case 4: {
                    r = false;
                    System.out.println("Thank You Visit Again");
                    break;
                }

                default:
                    System.out.println("Invalid Option");
            }

        } while (r);

        s.close();
    }
}