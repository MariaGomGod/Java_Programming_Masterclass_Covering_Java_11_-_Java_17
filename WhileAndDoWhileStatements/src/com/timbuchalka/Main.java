package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

//        int count = 1;
//
//        while(count != 6) {
//            System.out.println("count value is " + count);
//            count++;
//        }

        // Another option
//        count = 1;
//
//        while(true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("count value is " + count);
//            count++;
//        }

//        count = 1;
//        do {
//            System.out.println("count value is " + count);
//            count++;
//        } while(count != 6);

//        int number = 4;
//        int finishNumber = 20;
//
//        while(number <= finishNumber) {
//            number ++;
//            if(!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }

        // Modify the while code above.
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found.
        // And at the end, display the total number of even numbers found.

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(number <= finishNumber) {
            number ++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);

            evenNumbersFound++;
            if(evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);

    }

    // Create a method called isEvenNumber that takes a parameter of type int.
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // Return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
