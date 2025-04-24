package questionbank.java;
import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Subclass
class Student extends Person {
    private int rollNo;
    private String course;

    // Constructor
    public Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Course  : " + course);
        System.out.println("---------------------------");
    }
}
public class StudentInfoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to hold Student objects
        Student[] students = new Student[numStudents];

        // Collect details for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Roll Number: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Course: ");
            String course = scanner.nextLine();

            // Create a new Student object and add it to the array
            students[i] = new Student(name, age, rollNo, course);
        }

        // Display details of all students
        System.out.println("\n--- Student Information ---");
        for (Student student : students) {
            student.displayDetails();
        }

        scanner.close();
    }
}

