package pro.sky.java.course2.homework12;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> expectedResultsForSumTests() {
        return Stream.of(
                Arguments.of(10, 5, 5),
                Arguments.of(10, 7, 3)
        );
    }

    public static Stream<Arguments> expectedResultsForSubtractTests() {
        return Stream.of(
                Arguments.of(0, 5, 5),
                Arguments.of(4, 7, 3)
        );
    }

    public static Stream<Arguments> expectedResultsForMultiplyTests() {
        return Stream.of(
                Arguments.of(25, 5, 5),
                Arguments.of(21, 7, 3)
        );
    }

    public static Stream<Arguments> expectedResultsForDivideTests() {
        return Stream.of(
                Arguments.of(1, 5, 5),
                Arguments.of(2, 7, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("expectedResultsForSumTests")
    public void calculatorParameterizedTestSum(int expectedResult, int num1, int num2) {
        assertEquals(expectedResult, out.sum(num1, num2));

    }

    @ParameterizedTest
    @MethodSource("expectedResultsForSubtractTests")
    public void calculatorParameterizedTestSubtract(int expectedResult, int num1, int num2) {
        assertEquals(expectedResult, out.subtract(num1, num2));

    }

    @ParameterizedTest
    @MethodSource("expectedResultsForMultiplyTests")
    public void calculatorParameterizedTestMultiply(int expectedResult, int num1, int num2) {
        assertEquals(expectedResult, out.multiply(num1, num2));

    }

    @ParameterizedTest
    @MethodSource("expectedResultsForDivideTests")
    public void calculatorParameterizedTestDivide(int expectedResult, int num1, int num2) {
        assertEquals(expectedResult, out.divide(num1, num2));

    }

}
