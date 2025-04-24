package questionbank.java;
// import java.util.Arrays;
// import java.util.Scanner;

// public class sortarr {
//         public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of elements: ");
//         int n = scanner.nextInt();

//         int[] numbers = new int[n];

//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             numbers[i] = scanner.nextInt();
//         }
       
//         Arrays.sort(numbers);

//         System.out.println("Sorted array in ascending order:");
//         for (int num : numbers) {
//             System.out.print(num + " ");
//         }
//     }
// }
import java.util.Arrays;

public class sortarr{
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 4};

    
        Arrays.sort(numbers);
        System.out.print("Sorted array in ascending order: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
