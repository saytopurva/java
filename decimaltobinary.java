import java.util.*;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();

        String binary = "";//binary will store the resulting binary string
        while (num > 0) {
            binary = (num % 2) + binary;//reminder
            num = num / 2;//quotient
        }

        System.out.println("Binary: " + binary);

    }
}
// 10 % 2 = 0  = 0
// 10 / 2 = 5
// 5 % 2 = 1 = 1 + 0 = 10
// 5 / 2 = 2
// 2 % 2 = 0 = 0 + 10 = 010
// 2 / 2 = 1
// 1 % 2 = 1 = 1 + 010 = 1010
// 1 / 2 = 0