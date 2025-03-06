
public class CommandLineCalculator {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java CommandLineCalculator <num1> <num2> <operation>");
            System.out.println("Operations: 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            int choice = Integer.parseInt(args[2]);

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation choice. Please select 1, 2, 3, or 4.");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please ensure that the first two arguments are numbers and the third argument is an integer representing the operation.");
        }
    }
}
