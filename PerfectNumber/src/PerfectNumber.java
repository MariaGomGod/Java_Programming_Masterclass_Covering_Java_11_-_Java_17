public class PerfectNumber {

    public static void main(String[] args) {

        int number = 6;
        boolean resultIsPerfectNumber = isPerfectNumber(number);
        System.out.println("Is " + number + " a perfect number? " + resultIsPerfectNumber);
    }

    private static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sum = 0;
        System.out.print("The sum is ");

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum += i;
                if (i > 1) {
                    System.out.print(" + " + i);
                } else {
                    System.out.print(i);
                }
            }
        }
        System.out.println(" = " + sum);
        return sum == number;
    }
}
