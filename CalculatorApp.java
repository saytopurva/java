import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
class MultiCalc extends Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }
}
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MultiCalc calc = new MultiCalc();

        System.out.println("Enter first number for addition:");
        int addNum1 = scanner.nextInt();
        System.out.println("Enter second number for addition:");
        int addNum2 = scanner.nextInt();
        System.out.println("Addition: " + calc.add(addNum1, addNum2));

        System.out.println("Enter first number for multiplication:");
        int mulNum1 = scanner.nextInt();
        System.out.println("Enter second number for multiplication:");
        int mulNum2 = scanner.nextInt();
        System.out.println("Multiplication: " + calc.multiply(mulNum1, mulNum2));
    }
}