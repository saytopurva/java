import java.util.Scanner;

public class arearightang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        int base = input.nextInt();

        System.out.print("Enter the height of the triangle: ");
        int height = input.nextInt();

        int area = (base * height) / 2;

        System.out.println("Area of right-angled triangle: " + area);
}
}