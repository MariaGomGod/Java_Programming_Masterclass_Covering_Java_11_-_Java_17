public class FlourPacker {

    public static void main(String[] args) {

        boolean canPack = canPack(-3, 2, 12);
        System.out.println(canPack);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (goal < (bigCount * 5) + smallCount) {
            return false;
        }

        return (goal % 5) <= smallCount;
    }
}
