public class SumOddRange {

    public static void main(String[] args) {

        int result = sumOdd(1, 100);
        System.out.println("The sum is " + result);
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if(start > 0 && end > 0 && start <= end) {
            for(int i = start; i <= end; i++) {
                if(isOdd(i)) {
                    System.out.println("This number is " + i);
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }

    public static boolean isOdd(int number) {
        if(number < 0 && number % 2 != 0) {
            return true;
        }
        return false;
    }
}
