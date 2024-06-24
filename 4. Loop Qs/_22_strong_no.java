import java.util.Scanner;

public class _22_strong_no {

  public static void strongNo(int n) {
    int original = n; // Store the original value of n
    int s = 0;

    while (n > 0) {
      int digit = n % 10; // Extract the last digit
      s = s + factorial(digit); // Add the factorial of the digit to the sum
      n = n / 10; // Remove the last digit
    }
    if (original == s) {
      System.out.println(s + " is a Strong Number.");
    } else {
      System.out.println(s + " is not a Strong Number.");
    }

    // Check if the sum of factorials is equal to the original number
  }

  public static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Any Number: ");
    int num = sc.nextInt();
    strongNo(num);
  }
}
