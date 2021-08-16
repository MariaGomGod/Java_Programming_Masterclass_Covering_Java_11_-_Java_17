package academy.learnprogramming;

public class Main {

    private static final double POUNDS_INTO_KILOGRAMS = 0.45359237;

    public static void main(String[] args) {

        double resultPoundsIntoKilograms = poundsIntoKilograms(20);
        System.out.println(resultPoundsIntoKilograms);
    }

    private static double poundsIntoKilograms(double pounds) {

        return POUNDS_INTO_KILOGRAMS * pounds;

    }
}
