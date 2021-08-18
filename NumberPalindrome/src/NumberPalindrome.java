public class NumberPalindrome {

    public static void main(String[] args) {
        boolean resultIsPalindrome = isPalindrome(-1221);
        System.out.println(resultIsPalindrome);
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0; // store reverse number of given value
        int lastDigit = 0; // store value of last digit
        int value = number; // stores value given to us

        while(number != 0) {
            // extract the last digit of the given number
            lastDigit = number % 10; // Example: 212 modulus 10 = 2

            //increase the place value of reverse by one
            reverse *= 10; // reverse = reverse * 10;
            reverse += lastDigit; // reverse = reverse + lastDigit; Example: 0 + 2 = 2

            //remove the last digit of number
            number /= 10; // Example: 212 / 10 = 21
        }

        return value == reverse;
    }
}
