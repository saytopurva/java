import java.util.*;

public class binarynumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();

        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }

        System.out.println("Binary: " + binary);

    }
}
