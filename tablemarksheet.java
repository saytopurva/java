public class tablemarksheet {
    
    public static void main(String[] args) {
 
        String[] names = {"Siddhi", "Diya", "Shivam", "Purva", "Sanidhya"};
        int[] rollNumbers = {1, 2, 3, 4, 5};
        int[] marks = {90, 95, 96, 97, 99};
        double[] percentages = {90.0, 96.0, 78.0, 88.0, 98.0};

      
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Roll No", "Name", "Marks", "Percentage");
        System.out.println("---------------------------------------------");


        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-10d %-10s %-10d %-10.2f%n", rollNumbers[i], names[i], marks[i], percentages[i]);
        }
    }
}