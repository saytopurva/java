import java.util.*;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal: " + decimal);
    }
}
