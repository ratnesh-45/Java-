import java.util.*;

public class _2_r_natural_no {
  public static void main(String[] args) {
    // 2. Writ.e a program to print all natural numbers in reverse.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the reverse nth Natural No:-");
    int n = sc.nextInt();

    for (int i = n; i >= 1; i--) {
      System.out.print(i + " ");
    }
  }
}
