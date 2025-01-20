import java.util.Scanner;

class pattern {
  public static void rightAscTriangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++)
        System.out.print("*");
      System.out.println();
    }
  }

  public static void leftAscTriangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < n - i; j++)
        System.out.print(" ");

      for (int k = 1; k <= i; k++)
        System.out.print("*");
      System.out.println();
    }

  }

  public static void leftDescTriangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i - 1; j++)
        System.out.print(" ");

      for (int k = 1; k <= n + 1 - i; k++)
        System.out.print("*");
      System.out.println();
    }
  }

  public static void rightDescTriangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n + 1 - i; j++)
        System.out.print("*");
      System.out.println();
    }
  }

  public static void centralDiamond(int n) {
    for (int i = 1; i <= n; i++) {
      if (i <= n / 2) {
        for (int j = 1; j <= n - i; j++)
          System.out.print(" ");

        for (int k = 1; k <= i; k++)
          System.out.print("*");
      } else {
        for (int j = 1; j <= i - 1; j++)
          System.out.print(" ");

        for (int k = 1; k <= n + 1 - i; k++)
          System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void main(String[] args) {
    System.out.println("1.Right Asc Tiangle");
    System.out.println("2.left Asc Triangle");
    System.out.println("3.Left Asc Triangle");
    System.out.println("4.Right Asc Triangle");
    System.out.println("5.Central Diamond");
    Scanner scan = new Scanner(System.in);
    int choice = scan.nextInt();
    switch (choice) {

      case 1:
        rightAscTriangle(5);
        break;
      case 2:
        leftAscTriangle(5);
        break;
      case 3:
        leftAscTriangle(5);
        break;
      case 4:
        rightAscTriangle(5);
        break;
      case 5:
        centralDiamond(6);
        break;

    }
  }
}
