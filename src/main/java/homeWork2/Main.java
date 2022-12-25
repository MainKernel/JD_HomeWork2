package homeWork2;

import calculator.SumCalculator;

public class Main {
    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        try {
            System.out.println(calculator.sum(0));
        } catch (Exception e){
            System.out.println("Invalid number");
        }

    }
}