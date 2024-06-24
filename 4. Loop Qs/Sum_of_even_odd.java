import java.util.*;

public class Sum_of_even_odd {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // print the sum of even and odd integers:-
    System.out.print("Enter the Number:-");
    int n = sc.nextInt();
    int sumEven = 0;
    int sumOdd = 0;

    // start for loop:-
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        sumEven += i;

      } else {
        sumOdd += i;
      }

    }
    System.out.println("Sum of Even number:-" + sumEven);
    System.out.println("Sum of Odd number:-" + sumOdd);
  }
}
