import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // print the Factorial Number:-
    int fact = 1;
    System.out.print("Take any +ve integer number: ");
    int n = sc.nextInt();

    // using for loop:-
    for (int i = 1; i <= n; i++) {
      fact *= i; // Use multiplication for factorial calculation
    }
    System.out.println("Factorial is: " + fact);
  }
}
