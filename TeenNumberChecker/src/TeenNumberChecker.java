public class TeenNumberChecker {

    public static void main(String[] args) {

        boolean resultHasTeen = hasTeen(20, 20, 20);
        System.out.println(resultHasTeen);

        boolean resultIsTeen = isTeen(13);
        System.out.println(resultIsTeen);
    }

    public static boolean hasTeen(int num1, int num2, int num3) {

        return (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19);
    }

    public static boolean isTeen(int num4) {

        return num4 >= 13 && num4 <= 19;
    }

}
