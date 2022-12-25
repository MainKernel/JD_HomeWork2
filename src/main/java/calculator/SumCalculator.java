package calculator;

public class SumCalculator{
    public int sum(int number) throws IllegalArgumentException {
        if (number == 0) {
            throw new IllegalArgumentException();
        } else {
            int sum = 0;
            for (int i = 0; i <= number; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
