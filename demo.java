import java.util.*;

public class demo {
    public static void main(String[] args) {
        int a, b, c;
        String name;
        Scanner scan = new Scanner(System.in);
        float per;
        System.out.println("Enter your name ::");
        name = scan.next();
        System.out.println("Enter your marks1 ::");
        a = scan.nextInt();
        System.out.println("Enter your marks2");
        b = scan.nextInt();
        System.out.println("Enter your marks3 ::");
        c = scan.nextInt();
        System.out.println("Enter your per::");
        per = scan.nextFloat();
        System.out.println(name + " Welcome");
        System.out.println("Marks1 = " + a);
        System.out.println("Marks2 = " + b + "WELDONE");
        System.out.println("Marks3 = " + c + "per = " + per);
    }
}
