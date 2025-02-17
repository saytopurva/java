import java.util.*;

class marksheet {

    public static void main(String[] args) {
        int srNo = 1;
        String rollNo = "bsc24bct70";
        String name = "khushi nagare";
        int[] marks = { 85, 90, 78, 88, 92 }; 


        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        float percentage = (float) total / marks.length;

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("              Marksheet            ");
        System.out.println("Serial No.   : " + srNo);
        System.out.println("Roll No.     : " + rollNo);
        System.out.println("Name         : " + name);
        System.out.println("Subject Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + "   : " + marks[i]);
        }
        System.out.println("Total Marks  : " + total);
        System.out.println("Percentage   : " + percentage + "%");
        System.out.println("Grade        : " + grade);
    }
}