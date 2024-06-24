import java.util.Scanner;

public class diamond_pattern {

  public static void diamondPattern(int n) {
    // 1st half outer loop:-
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // 2nd half outer loop:-
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the rows Number:-");
    int n = sc.nextInt();
    diamondPattern(n);
  }
}
