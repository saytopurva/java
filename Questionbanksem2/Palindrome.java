package Questionbanksem2;

import java.util.*;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = scanner.nextInt();

        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        if (original == reversed) {
            System.out.println("is palindrome: ");

        } else {
            System.out.println("not palindrome: ");
        }

    }
}
