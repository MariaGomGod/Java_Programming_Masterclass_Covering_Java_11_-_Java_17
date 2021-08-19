public class FactorPrinter {

    public static void main(String[] args) {

        System.out.println("Factors of number 6 are: ");
        printFactors(6);

        System.out.println("Factors of number 32 are: ");
        printFactors(32);

        System.out.println("Factors of number 10 are: ");
        printFactors(10);

        System.out.println("Factors of number -1 is: ");
        printFactors(-1);
    }

    private static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid value");
        }

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.println(i + " ");
            }

        }
    }

}
