import java.util.*;

public class butterfly_pattern {

  public static void butterFly(int n) {
    // outer loop:
    for (int i = 1; i <= n; i++) {
      // print :- i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // print:-2*(n-i)
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      // print :- i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = n; i >= 1; i--) {
      // print :- i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // print:-2*(n-i)
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      // print :- i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the rows number:-");
    int n = sc.nextInt();
    butterFly(n);
  }
}
