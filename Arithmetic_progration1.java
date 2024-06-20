import java.util.*;

public class Arithmetic_progration1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Take the nth terms in A.P:");
    int n = sc.nextInt();
    int AP = 1;

    for (int i = 1; i <= n; i++) {

      System.out.print(AP + " ");
      AP *= 2;
    }
  }
}
