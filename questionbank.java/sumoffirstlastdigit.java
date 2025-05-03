package questionbank.java;
import java.util.Scanner;
public class sumoffirstlastdigit {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int lastDigit = num % 10;
        int firstDigit = num;
        
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        
        System.out.println("Sum of first and last digits: " + (firstDigit + lastDigit));
    }
}
}
