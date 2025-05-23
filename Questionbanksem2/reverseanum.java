package Questionbanksem2;
import java.util.Scanner;
public class reverseanum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
    
            System.out.print("Enter a number: ");
            int num = scanner.nextInt(); // Read the user's input
            int reversed = 0;
    
            // Loop to reverse the number
            while (num != 0) {
                int digit = num % 10; // Extract the last digit
                reversed = reversed * 10 + digit; // Append digit to reversed number
                num /= 10; // Remove the last digit from num
            }
    
            System.out.println("Reversed Number: " + reversed);
        }
    }

