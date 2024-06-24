import java.util.*;

public class _20_sum_integer {
  public static void main(String[] args) {
    // 21. Write a program to find number and sum of all integer between 100 and 200
    // which are divisible by 9.

    Scanner sc = new Scanner(System.in);
    int sum = 0;

    for (int i = 100; i <= 200; i++) {
      if (i % 9 == 0) {
        System.out.println(i);
        sum += i;
      }

    }
    System.out.println("Sum of integer b/w 100 to 200 divisible by 9:" + sum);
  }
}
