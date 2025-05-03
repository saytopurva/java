import java.util.Scanner;
import java.util.Arrays;
public class sortarr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] numbers = new int[size];

        // Prompt the user to enter the elements
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Display the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

}
