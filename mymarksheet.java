
import java.util.*;

public class mymarksheet {
    public static void main(String[] args) {
        String name = "Purva Pawar";
        String rollNo = "BSC24BCT91";

        HashMap<String, Integer> subWiseMarks = new HashMap<>();
        subWiseMarks.put(" Java", 90);
        subWiseMarks.put(" Networks", 91);
        subWiseMarks.put(" Blockchain Platform", 95);
        subWiseMarks.put(" Data Visualization", 95);
        subWiseMarks.put(" Web Development", 90);

        System.out.println(" ⭐ STUDENT REPORT CARD ⭐ ");
        System.out.println("📜-------------------------------------------------📜");
        System.out.println(" Name     : " + name);
        System.out.println("Roll No  : " + rollNo);
        System.out.println("📜-------------------------------------------------📜");
        System.out.println(" Subject                   Marks");
        System.out.println("📜-------------------------------------------------📜");

        int total = 0;
        for (Map.Entry<String, Integer> e : subWiseMarks.entrySet()) {
            System.out.printf(" %-25s %3d%n", e.getKey(), e.getValue());
            total += e.getValue();
        }

        System.out.println("📜-------------------------------------------------📜");
        System.out.println("Total Marks              :  " + total);

        int percentage = total * 100 / (subWiseMarks.size() * 100);
        System.out.println("Percentage               :  " + percentage + "%");

        System.out.println("📜-------------------------------------------------📜");
        System.out.print(" Grade                    : ");

        if (percentage >= 90)
            System.out.println("🅰️  - Excellent! ");
        else if (percentage >= 80)
            System.out.println("🅱️  -  Very Good!");
        else if (percentage >= 70)
            System.out.println("🅲  -  Good Effort! ");
        else if (percentage >= 60)
            System.out.println("🅳  -  Can Improve! ");
        else if (percentage >= 33)
            System.out.println("🅴  -  Needs More Work! ");
        else
            System.out.println(" Fail - Better Luck Next Time! ");

        System.out.println("📜-------------------------------------------------📜");
        System.out.println("🎓 Keep Learning, Keep Growing! ");
    }
}