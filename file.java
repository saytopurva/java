
import java.io.*;
import java.util.Scanner;

public class file {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source file name: ");
        String source = sc.nextLine();

        try (FileReader fr = new FileReader(source);) {
            int c;
            while ((c = fr.read()) != -1) 
                System.out.print((char)c);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
