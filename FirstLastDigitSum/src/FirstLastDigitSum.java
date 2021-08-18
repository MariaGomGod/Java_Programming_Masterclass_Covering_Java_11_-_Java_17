public class FirstLastDigitSum {

    public static void main(String[] args) {
       int number = 252;
       int sum = sumFirstAndLastDigit(number);
        System.out.println("Sum: " + sum);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10; // number = number / 10
        }
        firstDigit = number;

        return firstDigit + lastDigit;
    }
}
