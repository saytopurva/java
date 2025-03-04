import java.util.Scanner;

public class wordlettercount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
       
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            int letterCount = 0;

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
        
                if (Character.isLetter(c)) {
                    letterCount++;
                }
            }

           
            System.out.println(word + ": " + letterCount + " letters");
        }

        scanner.close();
    }
}
