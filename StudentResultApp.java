import java.util.Scanner;
class Student {
    int rollNo;
    String name;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}

class Result extends Student {
    int mark1, mark2, mark3;
    int total;
    float percentage;

    void acceptMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        mark2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        mark3 = sc.nextInt();
    }

    void calculateResult() {
        total = mark1 + mark2 + mark3;
        percentage = total / 3.0f;
    }

    void displayResult() {
        displayDetails();
        System.out.println("Marks:");
        System.out.println("Subject 1: " + mark1);
        System.out.println("Subject 2: " + mark2);
        System.out.println("Subject 3: " + mark3);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class StudentResultApp {
    public static void main(String[] args) {
        Result student = new Result();
        student.acceptDetails();
        student.acceptMarks();
        student.calculateResult();
        System.out.println("\n--- Student Result ---");
        student.displayResult();
    }
}
