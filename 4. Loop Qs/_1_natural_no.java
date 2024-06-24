import java.util.*;

public class _1_natural_no {
  public static void main(String[] args) {
    // 1. Write a program to print all natural numbers from 1 to n.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the nth Natural No:-");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.print(i+" ");
    }
  }
}
