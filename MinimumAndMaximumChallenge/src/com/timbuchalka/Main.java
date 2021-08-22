package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        while (true) {

            System.out.println("Enter number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number < minimum) {
                    minimum = number;
                }

                if (number > maximum) {
                    maximum = number;
                }

                scanner.nextLine();
            } else {
                break;
            }

        }

        System.out.println("The minimum is: " + minimum + " and the maximum is: " + maximum);
        scanner.close();
    }
}
