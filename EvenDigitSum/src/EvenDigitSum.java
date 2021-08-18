public class EvenDigitSum {

    public static void main(String[] args) {
        int sum = getEvenDigitSum(123456789);
        System.out.println("Sum of evens: " + sum);
    }

    private static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            // check if number is even
            if (lastDigit % 2 == 0) {
                sum += lastDigit; //sum = sum + lastDigit
            }
            number /= 10; // number = number / 10
        }
        return sum;
    }
}
