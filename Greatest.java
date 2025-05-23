
    import java.util.Scanner;
class Greatest {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
    System.out.println(Math.max(a, Math.max(b, c)));
  }
}
