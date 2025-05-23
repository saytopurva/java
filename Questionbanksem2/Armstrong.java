//Write a Java program to check whether a number is an Armstrong number or not.
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int originalNum = num;
        int sum = 0;

        // Count the number of digits
        int digits = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        // Calculate the sum of digits raised to the power of the number of digits
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // Check if the number is an Armstrong number
        if (sum == originalNum)
            System.out.println(originalNum + " is an Armstrong number.");
        else
            System.out.println(originalNum + " is not an Armstrong number.");

}    
}
