public class DecimalComparator {

    public static void main(String[] args) {

        boolean result = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        if (result) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The numbers are NOT equal");
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        int numberOne = (int) (number1 * 1000);
        int numberTwo = (int) (number2 * 1000);

        return numberOne == numberTwo;
    }
}
