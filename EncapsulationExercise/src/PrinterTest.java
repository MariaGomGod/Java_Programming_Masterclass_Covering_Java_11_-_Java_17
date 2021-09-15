import org.junit.Assert;
import org.junit.Test;

public class PrinterTest {

    @Test
    public void givenAPrinter_knowIfItIsNotADuplexOne() {
        Printer printer = new Printer(false);
        Assert.assertFalse(printer.isADuplexPrinter());
    }

    @Test
    public void givenAPrinter_knowIfItIsADuplexOne() {
        Printer printer = new Printer(true);
        Assert.assertTrue(printer.isADuplexPrinter());
    }

    @Test
    public void givenAPrinterWithSomeToner_whenPrintPage_thenTheNumberOfPagesShouldBeTheExpectedOne() {
        Printer printer = new Printer(false);
        printer.fillUpTonerLever(50);
        printer.printPage();
        Assert.assertEquals(1, printer.getNumberOfPagesPrinted());
    }

    @Test
    public void givenAPrinterWithNegativeTonerLevel_whenPrintPage_thenTheNumberOfPagesShouldNotChange() {
        Printer printer = new Printer(false);
        printer.fillUpTonerLever(-1);
        printer.printPage();
        Assert.assertEquals(0, printer.getNumberOfPagesPrinted());
    }

    @Test
    public void givenAPrinterWithUpperTonerLevel_whenPrintPage_thenTheNumberOfPagesShouldNotChange() {
        Printer printer = new Printer(false);
        printer.fillUpTonerLever(101);
        printer.printPage();
        Assert.assertEquals(0, printer.getNumberOfPagesPrinted());
    }

    @Test
    public void givenAPrinterWithoutAnyToner_whenPrintPage_thenTheNumberOfPagesShouldNotChange() {
        Printer printer = new Printer(false);
        printer.fillUpTonerLever(0);
        printer.printPage();
        Assert.assertEquals(0, printer.getNumberOfPagesPrinted());
    }

    @Test
    public void givenAPrinterWithSomeToner_whenPrintPage_thenTheRemainingTonerLevelShouldBeTheExpectedOne() {
        Printer printer = new Printer(false);
        printer.fillUpTonerLever(50);
        printer.printPage();
        Assert.assertEquals(49, printer.getTonerLevel());
    }

    @Test
    public void givenAPrinterWithoutAnyToner_whenPrintPage_thenTheRemainingTonerLevelShouldNotChange() {
        Printer printer = new Printer(false);
        printer.fillUpTonerLever(0);
        printer.printPage();
        Assert.assertEquals(0, printer.getTonerLevel());
    }
}
