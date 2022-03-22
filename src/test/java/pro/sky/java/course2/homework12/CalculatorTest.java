package pro.sky.java.course2.homework12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    CalculatorServiceImpl test1 = new CalculatorServiceImpl();
    CalculatorServiceImpl test2 = new CalculatorServiceImpl();

    int sum1 = 10;
    int subtract1 = 0;
    int multiply1 = 25;
    int divide1 = 1;

    int sum2 = 10;
    int subtract2 = 4;
    int multiply2 = 21;
    int divide2 = 2;

    @Test
    public void calculatorTestSum() {

        int testSum1 = test1.sum(5, 5);
        int testSum2 = test2.sum(7, 3);


        assertEquals(sum1, testSum1);
        assertEquals(sum2, testSum2);

    }

    @Test
    public void calculatorTestSubtract() {

        int testSubtract1 = test1.subtract(5, 5);
        int testSubtract2 = test2.subtract(7, 3);

        assertEquals(subtract1, testSubtract1);
        assertEquals(subtract2, testSubtract2);

    }

    @Test
    public void calculatorTestDivide() {

        int testDivide1 = test1.divide(5, 5);
        int testDivide2 = test2.divide(7, 3);

        assertEquals(divide1, testDivide1);
        assertEquals(divide2, testDivide2);

    }

    @Test
    public void calculatorTestMultiply() {

        int testMultiply1 = test1.multiply(5, 5);
        int testMultiply2 = test2.multiply(7, 3);

        assertEquals(multiply1, testMultiply1);
        assertEquals(multiply2, testMultiply2);

    }


    @Test
    public void shouldReturnIllegalArgumentException() {
        CalculatorServiceImpl test = new CalculatorServiceImpl();
        assertThrows(IllegalArgumentException.class, () -> test.divide(5, 0));
    }
}
