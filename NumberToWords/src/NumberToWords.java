public class NumberToWords {

    public static void main(String[] args) {

        String numberToWords = numberToWords(34000);
        System.out.println(numberToWords);
    }

    private static String numberToWords(int number) {

        if (number < 0) {
            return "Invalid value";
        }

        int reverse = reverse(number);
        int missingZeros = getDigitCount(number) - getDigitCount(reverse);

        // StringBuilder es una clase que sirve para concatenar un número elevado de
        // Strings. Es especialmente útil cuando se quiere construir un String dentro
        // de un bucle.
        StringBuilder words = new StringBuilder();
         do {
            int lastDigit = reverse % 10;
            reverse /= 10;
             switch (lastDigit) {
                 case 0 -> words.append("Zero ");
                 case 1 -> words.append("One ");
                 case 2 -> words.append("Two ");
                 case 3 -> words.append("Three ");
                 case 4 -> words.append("Four ");
                 case 5 -> words.append("Five ");
                 case 6 -> words.append("Six ");
                 case 7 -> words.append("Seven ");
                 case 8 -> words.append("Eight ");
                 case 9 -> words.append("Nine ");
             }
        } while (reverse > 0);


         if (missingZeros > 0) {
             for (int i = 0; i < missingZeros; i++) {
                 words.append("Zero ");
             }
         }
         return words.toString();
    }

    private static int reverse(int number) {
        
        int reverse = 0;
        
        for (int i = getDigitCount(number) - 1; i >= 0; i--) {
            int lastDigit = number % 10;
            number /= 10;
            reverse += lastDigit * Math.pow(10, i);
        }
        return reverse;
    }

    private static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int counter = 1;

        while (number >= 10) {
            counter++;
            number /= 10;
        }
        
        return counter;
    }
}
