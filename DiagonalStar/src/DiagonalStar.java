public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid value");
        }

        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                if (row == 0 || row == col || col == 0 || row == (number - 1) ||
                        col == (number - 1) || row + col == (number - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.println(); // creates a new row
            }
        }

    }
}
