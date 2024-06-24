import java.util.*;

public class _5_even_odd {
  public static void main(String args[]) {
    // Write a program to check whether a number is even or odd.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number:-");
    int n = sc.nextInt();

    if (n % 2 == 0) {
      System.out.print("It's Even No");
    } else {
      System.out.print("It's odd No");
    }
  }
}
