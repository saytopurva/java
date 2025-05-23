//Write a Java program to check whether a number is a perfect number or not.

import java.util.Scanner;

public class perfectnum {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        // Calculate sum of proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum equals the original number
        if (sum == number && number != 0) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
