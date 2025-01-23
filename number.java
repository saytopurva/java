import java.util.Scanner;

class number {
    public static void Factorial(int num) {
        System.out.print("Enter a number: ");
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }

    public static void Fibonacci(int n) {
        System.out.print("Enter the number of terms: ");
        int a = 0, b = 1, next;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }

    public static void PowerofaNumber(int base, int exp) {
        System.out.print("Enter base: ");
        System.out.print("Enter exponent: ");
        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);
    }

    public static void CountDigits(int num) {
        System.out.print("Enter a number: ");
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        System.out.println("Number of digits: " + count);
    }

    public static void Armstrong(int num) {
        System.out.print("Enter a number: ");
        int temp = num, sum = 0, digits = 0;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }

    public static void primeNumbers(int num) {
        System.out.print("Enter a number: ");
        boolean isPrime = true;
        if (num < 2)
            isPrime = false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + " is " + (isPrime ? "a Prime number." : "not a Prime number."));
    }

    public static void printArmstrongNumbersTillN(int n) {
        System.out.print("Enter the limit (N): ");
        System.out.print("Armstrong numbers: ");
        for (int num = 1; num <= n; num++) {
            int temp = num, sum = 0, digits = 0;
            while (temp > 0) {
                temp /= 10;
                digits++;
            }
            temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == num)
                System.out.print(num + " ");
        }
    }

    public static void printprimenumberstillN(int n) {
        System.out.print("Enter the limit (N): ");
        System.out.print("Prime numbers: ");
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(num + " ");
        }
    }

    public static void Palindrome(int num) {
        System.out.print("Enter a number: ");
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        if (original == reversed)
            System.out.println(original + " is a Palindrome.");
        else
            System.out.println(original + " is not a Palindrome.");
    }

    public static void squareRootofaNumber(int num) {
        System.out.print("Enter a number: ");
        System.out.println("Square root: " + Math.sqrt(num));

    }

    public static void findLCM(int a, int b) {
        System.out.print("Enter two numbers: ");
        int lcm = (a > b) ? a : b;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM: " + lcm);
                break;
            }
            lcm++;
        }
    }

    public static void findHCF(int a, int b) {
        System.out.print("Enter two numbers: ");
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("HCF: " + a);
    }

    public static void main(String[] args) {
        boolean cont = true;
        while (cont) {
            System.out.println("1.Factorial");
            System.out.println("2.Fibonacci");
            System.out.println("3.PowerofaNumber");
            System.out.println("4.CountDigits");
            System.out.println("5.Armstrong");
            System.out.println("6.primeNumbers");
            System.out.println("7.printArmstrongNumbersTillN");
            System.out.println("8.printprimenumberstillN");
            System.out.println("9.Palindrome");
            System.out.println("10.squareRootofaNumber");
            System.out.println("11.findLCM");
            System.out.println("12.findHCF");

            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            switch (choice) {

                case 1:
                    Factorial(5);
                    break;
                case 2:
                    Fibonacci(5);
                    break;
                case 3:
                    PowerofaNumber(2,3);
                    break;
                case 4:
                    CountDigits(5);
                    break;
                case 5:
                    Armstrong(6);
                    break;
                case 6:
                    primeNumbers(5);
                    break;
                case 7:
                    printArmstrongNumbersTillN(5);
                    break;
                case 8:
                    printprimenumberstillN(5);
                    break;
                case 9:
                    Palindrome(5);
                    break;
                case 10:
                    squareRootofaNumber(5);
                    break;
                case 11:
                    findLCM(2,3);
                    break;
                case 12:
                    findHCF(2,3);
                    break;

                default:
                    cont = false;
            }
        }
    }
}
