import java.util.*;

public class _10_sum_even {
  public static void main(String[] args) {
    // 10. Write a program to find sum of all even numbers between 1 to n.

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the nth even term:-");
    int n = sc.nextInt();

    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        sum += i;
      }

    }
    System.out.println("Sum of even Number:-" + sum);
  }
}
