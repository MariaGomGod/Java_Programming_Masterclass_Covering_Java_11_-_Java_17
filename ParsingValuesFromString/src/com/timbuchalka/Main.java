package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        String numberAsString2 = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString); // parseInt() converts a string
        // into a number in order to use that number to calculate something.
        double number2 = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);
        System.out.println("number2 = " + number2);

        numberAsString += 1;
        numberAsString2 += 1;
        number += 1;
        number2 += 1;

        System.out.println("numberAsString = " + numberAsString); // output: "2018" + "1" = 20181
        System.out.println("numberAsString2 = " + numberAsString2); // output: "2018.125" + "1" = 2018.1251
        System.out.println("number = " + number); // output: 2018 + 1 = 2019
        System.out.println("number2 = " + number2); // output: 2018.0 + 1 = 2019.0
    }
}
