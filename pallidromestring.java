import java.util.Scanner;
public class pallidromestring {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
String rev = "";
for(int i = str.length() - 1; i >= 0; i--) rev +=
str.charAt(i);
if(str.equals(rev)) System.out.println("is a Palindrome");
else System.out.println("Not a palindrome");
}
}