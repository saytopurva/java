
// Write a Java program to check whether a number is prime or not.
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = scan.nextInt();
        boolean isprime = true;

        if (num <= 1) {
            isprime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        // if (isprime) {
        //     System.out.println(num + " is prime number. ");
        // } else {
        //     System.out.println(num + " is not prime number.");
        // }
        System.out.println(num + (isprime ? " is " : " is not ")+"a prime number.");

    }

}
