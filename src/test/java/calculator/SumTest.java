package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class SumTest {
    private SumCalculator calculator;

    @BeforeEach
    public void BeforeEach() {
        calculator = new SumCalculator();
    }

    @Test
    public void TestThatSumOfOneWorksCorrect() {
        //When
        int actual = calculator.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatSumOfSixWorksCorrect() {
        //When
        int actual = calculator.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatSumOfZeroWorksCorrect() {
        //When
        Executable actual = () -> calculator.sum(0);

        //Then
        Class<IllegalArgumentException> expected = IllegalArgumentException.class;
        Assertions.assertThrows(expected, actual);
    }
}
