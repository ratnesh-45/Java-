import java.util.*;

public class Factorial_nth_number {
  public static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the nth terms of factorail:-");
    int n = sc.nextInt();
    System.out.println("Factorail is:" + factorial(n));
  }
}
