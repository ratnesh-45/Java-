import java.util.*;

public class _16_sum_digit {
  public static void main(String[] args) {
    // 16. write a program to sum of its Digits.

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Digits:-");
    int digit = sc.nextInt();

    int sum = 0;
    while (digit > 0) {
      sum = sum + digit % 10;
      digit = digit / 10;
    }
    System.out.println("Sum of Digits:" + sum);
  }
}
