import java.util.*;

public class practices {

  public static void pattern(int r, int c) {
    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= c; j++) {
        if (i == 1 || i == r || j == 1 || j == c) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the rows:-");
    int r = sc.nextInt();
    System.out.print("Enter the rows:-");
    int c = sc.nextInt();
    pattern(r, c);
  }
}
