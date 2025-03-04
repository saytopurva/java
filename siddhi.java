import java.util.Scanner;
public class siddhi{
    public static void main(String[]args){
        Scanners scanner = new Scanner(System.in);
        System.out.print("Enter an alphanumeric string:");
        String input = scanner.nextLine();
        if(input.is.Empty()){
            System.out.println("No input provided!");
        } else {
            String numbers = input.replaceAll("[^0-9]","");
        
    }
        
        scanner.close();
    }
