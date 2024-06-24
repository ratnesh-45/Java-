import java.util.*;

public class sum_digit {
  public static void sumDigit(int n) {
    int sum = 0;
    while (n > 0) {
      sum = sum + n % 10;
      n = n / 10;
    }
    System.out.print("Sum of Digits:" + sum);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Take the Number:-");
    int n = sc.nextInt();
    sumDigit(n);
  }
}
