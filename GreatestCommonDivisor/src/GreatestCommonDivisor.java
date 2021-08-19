public class GreatestCommonDivisor {

    public static void main(String[] args) {

        int resultGetGreatestCommonDivisor = getGreatestCommonDivisor(81, 153);
        System.out.println("The greatest common divisor is: " + resultGetGreatestCommonDivisor);
    }

    private static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int greatestCommonDivisor = 1;

        for (int i = 1; i <= first && i <= second; i++) {

            if(first % i == 0 && second % i == 0) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }
}
