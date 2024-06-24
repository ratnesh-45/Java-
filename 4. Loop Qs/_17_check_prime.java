import java.util.*;

public class _17_check_prime {
  public static void main(String[] args) {
    // 17. write a program to Check Whether a Given Number is Prime or Not.

    Scanner sc = new Scanner(System.in);
    System.out.print("Take the Number:-");
    int n = sc.nextInt();

    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        count++;
      }

    }
    if (count == 2) {
      System.out.println("This Number is Prime");
    } else {
      System.out.println("This Number is not Prime");
    }
  }
}
