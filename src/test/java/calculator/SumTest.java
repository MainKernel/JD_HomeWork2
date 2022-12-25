package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        int actual;
        //When
        try {
            actual = calculator.sum(0);

            //Then
            int expected = 0;
            Assertions.assertEquals(expected, actual);

        } catch (IllegalArgumentException ex) {
            //Expected
            ex.printStackTrace();
        }
    }
}
