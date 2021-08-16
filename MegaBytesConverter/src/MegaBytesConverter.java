public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }

        double megaBytes = kiloBytes / 1024;
        double remainder = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
    }
}
