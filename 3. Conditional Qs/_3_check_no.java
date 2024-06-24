import java.util.*;

public class _3_check_no {
  public static void main(String args[]) {
    // Write a program to check whether a number is negative, positive or zero.
    Scanner sc = new Scanner(System.in);
    System.out.print("Input the Number:-");
    int n = sc.nextInt();

    if (0 <= n) {
      System.out.print("It's +ve no");
    } else {
      System.out.print("It's -ve no");
    }
  }
}
