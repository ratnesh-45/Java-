import java.util.*;

public class primeInRange {

  public static boolean isPrime(int n) {
    for (int i = 2; i <= n - 1; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void prime(int n) {
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the nth Terms:-");
    int n = sc.nextInt();
    prime(n);

  }
}
