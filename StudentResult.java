import java.util.Scanner;

class Student {
    int rollNo;
    String name;
}

class Result extends Student {
    int mark1, mark2, mark3;
    int total;
    float percentage;
}

 class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result student = new Result();

        System.out.print("Enter Roll Number: ");
        student.rollNo = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Name: ");
        student.name = sc.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        student.mark1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        student.mark2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        student.mark3 = sc.nextInt();

        student.total = student.mark1 + student.mark2 + student.mark3;
        student.percentage = (float) student.total / 3;

        System.out.println("\n ___Student Result ---");
        System.out.println("Roll Number: " + student.rollNo);
        System.out.println("Name: " + student.name);
        System.out.println("Subject 1 Marks: " + student.mark1);
        System.out.println("Subject 2 Marks: " + student.mark2);
        System.out.println("Subject 3 Marks: " + student.mark3);
        System.out.println("Total Marks: " + student.total);
        System.out.println("Percentage: " + student.percentage + "%");

    }
}
