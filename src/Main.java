import context.Calculator;
import strategy.AddStrategy;
import strategy.SubtractStrategy;
import strategy.MultiplyStrategy;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(new AddStrategy());

        System.out.println("Addition: " + calculator.calculate(10, 5));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println("Subtraction: " + calculator.calculate(10, 5));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("Multiplication: " + calculator.calculate(10, 5));
    }
}
