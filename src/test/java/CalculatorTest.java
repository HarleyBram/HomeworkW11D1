import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest{

    @Before
    public void calculator() = new Calculator;

    @Test
    public void canAdd(){
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    public void canSubtract(){
        assertEquals(7, calculator.subtract(10, 3));
    }

    @Test
    public void canMultiply(){
        assertEquals(15, calculator.mulitply(3, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(4.00, calculator.divide(20.00, 5.00), 0.01);
    }


}
