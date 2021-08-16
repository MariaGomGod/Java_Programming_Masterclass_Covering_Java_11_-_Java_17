public class BarkingDog {

    public static void main(String[] args) {

        boolean result = shouldWakeUp(true, 1);
        System.out.println("result = " + result);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
