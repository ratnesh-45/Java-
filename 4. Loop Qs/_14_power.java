import java.util.*;

public class _14_power {
  public static void main(String[] args) {
    // 14. Write a program to find the value of one number raised to the power of
    // another.

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the base Number:-");
    int base = sc.nextInt();
    System.out.print("Enter the power Number:-");
    int power = sc.nextInt();

    System.out.println((double) Math.pow(base, power));

  }
}
