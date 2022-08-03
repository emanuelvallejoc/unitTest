package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        var result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing subtraction: 1-1=0")
    void subtraction() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;

        // Act
        var result = basicCalculator.subtraction(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several subtraction ")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    1, -1",
            "1,    2, -1",
            "49,  51, -2",
            "1,  100, -99"
    })
    void severalSubtraction(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subtraction(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing multiplication: 2x2=4")
    void multiplication() {
        // Arrange
        Long number1 = 2L;
        Long number2 = 2L;
        Long expectedValue = 4L;

        // Act
        var result = basicCalculator.multiplication(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several multiplication")
    @ParameterizedTest(name = "{0} x {1} = {2}")
    @CsvSource({
            "0,  1,   0",
            "1,  2,   2",
            "2,  2,   4",
            "3,  3,   9"
    })
    void severalMultiplication(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiplication(first, second),
                () -> first + " x " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing division: 4/2=2")
    void division() {
        // Arrange
        Long number1 = 4L;
        Long number2 = 2L;
        Long expectedValue = 2L;

        // Act
        var result = basicCalculator.division(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several division")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "6 , 2 , 3 ",
            "12 , 6 , 2 ",
            "10 , 10 , 1 ",
    })
    void severalDivision(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.division(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }
}
