public class SharedDigit {

    public static void main(String[] args) {
        boolean resultHasSharedDigit = hasSharedDigit(12, 23);
        System.out.println(resultHasSharedDigit);
    }

    private static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        do {
            int lastDigitNumber1 = number1 % 10;
            System.out.println("Number 1 last digit: " + lastDigitNumber1);
            do {
                int lastDigitNumber2 = number2 % 10;
                System.out.println("Number 2 last digit: " + lastDigitNumber2);
                if (lastDigitNumber1 == lastDigitNumber2) {
                    return true;
                }
                number2 /= 10;
            } while (number2 > 0);
            number1 /= 10;
        } while (number1 > 0);

        return false;
    }
}
