import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1.right asc triangle");
        System.out.println("2.leftasc triangle");
        System.out.println("3.leftdesc triangle");
        System.out.println("4.left desc triangle");
        System.out.println("5.central diamond");
        int a=scan.nextInt();
        System.out.println("Enter number of rows in pattern");
        int n = scan.nextInt();
         switch(a)
          {
            case 1 :{ 
              for(int i=1;i<=n;i++)
            {
              for(int j=1;j<i;j++)
              System.out.print("*");
              System.out.println();
            }
            break;
          }
            

      case 2:{ for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            System.out.print(" ");

            for(int k=1;k<=i;k++)
            System.out.print("*");
            System.out.println();
        }
        break;
      }

      case 3 :{ for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i-1;j++)
            System.out.print(" ");

            for(int k=1;k<=2*n-1;k++)
            System.out.print("*");
            System.out.println();
        }
        break;
      }
      

      case 4 :{for(int i=1;i<=n;i++)
        {   for(int j=1;j<=i;j++)
            System.out.print(" ");
            System.out.println();
        }
        break;
     }
     

     case 5 :{for(int i=1;i<=n;i++)
        {if(i<=a/2)
        {for(int j=1;j<=n-i;j++)
            System.out.print(" ");

            for(int k=1;k<=i;k++)
            System.out.print("*");}
        else
        {for(int j=1;j<=i-1;j++)
            System.out.print(" ");

            for(int k=1;k<=n+1-1;k++)
            System.out.print("*");}       
        }System.out.println();
            break;
     }

    }
}
}