public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private final boolean isADuplexPrinter;

    public Printer(boolean isADuplexPrinter) {
        this.isADuplexPrinter = isADuplexPrinter;
    }

    public void fillUpTonerLever(int tonerLevel) {

        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            System.out.println("The toner is not filled up");
        }
    }

    public void printPage() {

        if (tonerLevel > 0) {
            numberOfPagesPrinted++;
            tonerLevel--;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isADuplexPrinter() {
        return isADuplexPrinter;
    }
}
