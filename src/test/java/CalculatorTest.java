import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){calculator = new Calculator();}

    @Test
    public void add(){assertEquals(10, calculator.add(5, 5));}

    @Test
    public void subtract(){assertEquals(25, calculator.subtract(30, 5));}

    @Test
    public void multiply(){assertEquals(30, calculator.multiply(5, 6));}

    @Test
    public void divide(){assertEquals(2, calculator.divide(10, 5), 0.0);}
}
