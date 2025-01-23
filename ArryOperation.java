import java.util.*;

class ArryOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Sum of array elements");
            System.out.println("2. Swap array elements");
            System.out.println("3. Count duplicate elements");
            System.out.println("4. Display unique elements");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int sum = 0;
                    for (int num : arr) {
                        sum += num;
                    }
                    System.out.println("Sum of array elements: " + sum);
                    break;

                case 2:
                    System.out.print("Enter index 1 to swap: ");
                    int idx1 = scanner.nextInt();
                    System.out.print("Enter index 2 to swap: ");
                    int idx2 = scanner.nextInt();

                    if (idx1 >= 0 && idx1 < n && idx2 >= 0 && idx2 < n) {
                        int temp = arr[idx1];
                        arr[idx1] = arr[idx2];
                        arr[idx2] = temp;
                        System.out.println("Array after swapping: ");
                        for (int num : arr) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;

                case 3:
                    int duplicateCount = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (arr[i] == arr[j]) {
                                duplicateCount++;
                                break;
                            }
                        }
                    }
                    System.out.println("Number of duplicate elements: " + duplicateCount);
                    break;

                case 4:
                    System.out.println("Unique elements in the array:");
                    for (int i = 0; i < n; i++) {
                        boolean isUnique = true;
                        for (int j = 0; j < n; j++) {
                            if (i != j && arr[i] == arr[j]) {
                                isUnique = false;
                                break;
                            }
                        }
                        if (isUnique) {
                            System.out.print(arr[i] + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
