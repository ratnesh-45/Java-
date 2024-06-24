import java.util.*;

public class _9_sum_natural {
  public static void main(String[] args) {
    //
    // 9. Write a program to find sum of all natural numbers between 1 to n.

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the nth natual term:-");
    int n = sc.nextInt();
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.print("Sum of natual Number:-" + sum);
  }
}
