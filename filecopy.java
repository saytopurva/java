import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filecopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source file name: ");
        String source = sc.nextLine();
        System.out.print("Enter destination file name: ");
        String dest = sc.nextLine();

        try (FileReader fr = new FileReader(source); FileWriter fw = new FileWriter(dest)) {
            int c;
            while ((c = fr.read()) != -1) fw.write(c);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
