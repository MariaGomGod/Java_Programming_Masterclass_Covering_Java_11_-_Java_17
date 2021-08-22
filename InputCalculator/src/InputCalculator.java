import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numbers = 0;

        while (true) {
            System.out.println("Enter a number:");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number; // we add the number that the user introduced to what we had already summed
                numbers++; // we increment numbers to remember how many numbers we have seen so far
                scanner.nextLine();
            } else {
                break;
            }
        }

        if (numbers == 0) { // we check if numbers is 0 because we cannot divide by 0. In this case
            // we print only the sum.
            System.out.println("SUM = " + sum);
        } else {
            long average = Math.round((double) sum / numbers);
            System.out.println("SUM = " + sum + " AVG = " + average);
        }

    }
}
