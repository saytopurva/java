import java.util.Scanner;

public class areacyl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        double area = 2 * Math.PI * r * (r + h);

        System.out.println("Total Surface Area = " + area);

        sc.close();
    }
}
