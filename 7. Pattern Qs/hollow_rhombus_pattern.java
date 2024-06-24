import java.util.Scanner;

public class hollow_rhombus_pattern {

  public static void hollowRhombus(int n) {
    // outer loop:-
    for (int i = 1; i <= n; i++) {
      // print space:-
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
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
    System.out.print("Enter the rows Number:-");
    int n = sc.nextInt();
    hollowRhombus(n);
  }
}
