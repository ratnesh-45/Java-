import java.util.Scanner;

public class check_factorial_no {

  public static void chaeckFact(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    if (count == 2) {
      System.out.println("This Number is prime No.");
    } else {
      System.out.println("This Number is Not prime No.");
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number:-");
    int n = sc.nextInt();
    chaeckFact(n);

  }

}
