import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){printer = new Printer(100, 65);}

    @Test
    public void hasPaper(){assertEquals(100, printer.getPaperLeft());}

    @Test
    public void hasToner(){assertEquals(65, printer.getTonerLeft());}

    @Test
    public void willPrint(){assertEquals(true, printer.canPrint(20, 2));}

    @Test
    public void willNotPrint(){assertEquals(false, printer.canPrint(120, 2));}

    @Test
    public void willUsePaperWhenPrinting(){
        printer.print(30, 2);
        assertEquals(40, printer.getPaperLeft());
        assertEquals(5, printer.getTonerLeft());

    }

}
