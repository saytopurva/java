import java.util.Scanner;

public class Innerbasic {
    int a,b,c;
    void add ()
    {}
}
public class Innerbasic_1 extends Innerbasic {
    Scanner scan = new Scanner(System.in);
    void add()
{
System.out.println("---first child class---");
System.out.println("enter a;");
 a = scan.nextInt();
System.out.println("enter b:");
b = scan.nextInt();
c=a+b;
System.out.println("Add="+c);
}
public class Innerbasic_2 extends  Innerbasic_1  {
    Scanner scan = new Scanner(System.in);
    void add()
    {
        System.out.println();
    }
    
}


public class basic {
    
}
}