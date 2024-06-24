import java.util.*;

public class Prime_Nos {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // Check the number if prime or not.
    System.out.print("Take the Number:-");
    int n = sc.nextInt();
    int count = 0;

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        count++;
      }

    }
    if (count == 2) {
      System.out.println("This Number is prime no");
    } else {
      System.out.println("This Number is Not prime no");
    }
  }
}
