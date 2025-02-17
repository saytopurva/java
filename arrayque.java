import java.util.*;

public class arrayque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int firstElement = numbers[0];
        System.out.println("First element: " + firstElement);

        System.out.print("Matching indices: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == firstElement) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}