//Write a Java program to count the digits in a number.
import java.util.*;
public class countofdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number /= 10;  // Remove the last digit
                count++;       // Increment the count
            }
        }
        System.out.println("Number of digits: " + count);}
}
