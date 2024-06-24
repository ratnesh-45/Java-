import java.util.*;

public class _13_factorial_no {
  public static void main(String[] args) {
    // 13. Write a program to find the factorial value of any number.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the any Number:-");
    int n = sc.nextInt();

    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;

    }
    System.out.println("Factorial is:" + fact);
  }
}
