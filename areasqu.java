import java.util.Scanner;

public class areasqu {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the square: ");
        double length = input.nextDouble();

        System.out.print("Enter the breath of the square: ");
        double breath = input.nextDouble();

        double area = length * breath;

        System.out.println("Area of the circle: " + area);

        input.close();
    }
}

