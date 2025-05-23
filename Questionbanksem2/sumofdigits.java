import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) { //entry point of code
        Scanner scan = new Scanner(System.in);//create scanner name obj 

        System.out.println("enter a number:");//print enter a number
        int number = scan.nextInt();//read the integer value by number and store it in variable number 
        int sum = 0;//initialized a variable sum from 0

        while (number != 0) {//start a while loop that continue as long as number is not 0
            sum = sum + number % 10;//get the last digit from number and add it to sum
            number /= 10;//remove the last digt of number 
        }
        System.out.println("sum of digits: " + sum);
    }

}
