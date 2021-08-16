public class EqualSumChecker {

    public static void main(String[] args) {

        boolean result = hasEqualSum(1, -1, 4);
        System.out.println(result);
    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {

        int resultSumTwoNumbers = num1 + num2;

        return resultSumTwoNumbers == num3;
    }
}
