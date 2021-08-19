public class LastDigitChecker {

    public static void main(String[] args) {

        boolean resultHasSameLastDigit = hasSameLastDigit(23, 32, 42);
        System.out.println(resultHasSameLastDigit);

    }

    private static boolean hasSameLastDigit(int number1, int number2, int number3) {

        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        }

        int lastDigitNumberOne = number1 % 10;
        System.out.println("Number 1 last digit " + lastDigitNumberOne);

        int lastDigitNumberTwo = number2 % 10;
        System.out.println("Number 2 last digit " + lastDigitNumberTwo);

        int lastDigitNumberThree = number3 % 10;
        System.out.println("Number 3 last digit " + lastDigitNumberThree);

        return  lastDigitNumberOne == lastDigitNumberTwo ||
                lastDigitNumberTwo == lastDigitNumberThree ||
                lastDigitNumberThree == lastDigitNumberOne;
    }

    private static boolean isValid(int number1) {

        return number1 >= 10 && number1 <= 1000;

    }
}
