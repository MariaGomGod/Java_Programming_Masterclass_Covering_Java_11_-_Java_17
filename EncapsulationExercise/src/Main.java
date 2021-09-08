public class Main {

    public static void main(String[] args) {
        // Create a class and demonstrate proper encapsulation techniques.
        // The class will be calle Printer. It will simulate a real Computer Printer.
        // It should have fields for the toner Level, number of pages printed and
        // also whether it is a duplex printer (capable of printing on both sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%), another method to
        // simulate printing page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors and anything else you think is needed.

        Printer printer = new Printer(false);
        printer.fillUpTonerLever(50);
        printer.printPage();
        System.out.println("Number of pages printed: " + printer.getNumberOfPagesPrinted());
        System.out.println("Remaining toner level: " + printer.getTonerLevel());
    }
}
