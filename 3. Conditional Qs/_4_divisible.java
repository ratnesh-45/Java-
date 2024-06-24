import java.util.*;

public class _4_divisible {
  public static void main(String args[]) {
    // Write a program to check whether a number is divisible by 5 and 11 or not.
    Scanner sc = new Scanner(System.in);
    System.out.print("Take the Number:-");
    int n = sc.nextInt();

    if (n % 5 == 0 && n % 11 == 0) {
      System.out.print("This no is divisible by 5 or 11");
    } else {
      System.out.println("This no is not divisible both");
    }
  }
}
