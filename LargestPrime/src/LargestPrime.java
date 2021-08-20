public class LargestPrime {

    public static void main(String[] args) {

        int getLargestPrimeFactorNumber = getLargestPrime(113);
        System.out.println(getLargestPrimeFactorNumber);
    }

    private static int getLargestPrime(int number) {

        if (number <= 0) {
            return -1;
        }

        int largestPrimeFactor = -1;

        for (int i = 2; i < number; i++) {

            if (number % i == 0 && isPrime(i)) {
                largestPrimeFactor = i;
            }
        }

        return largestPrimeFactor;
    }

    private static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
