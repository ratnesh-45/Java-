import java.util.*;

public class _2_max_no {
  public static void main(String args[]) {
    // Write a program to find maximum between three numbers.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the 1st no:-");
    int a = sc.nextInt();
    System.out.print("Enter the 2nd no:-");
    int b = sc.nextInt();
    System.out.print("Enter the 3rd no:-");
    int c = sc.nextInt();

    if (a > b && c < a) {
      System.out.println("Maximum no is:" + a);
    } else if (b > a && c < b) {
      System.out.println("Maximum no is:" + b);
    } else {
      System.out.println("Maximum no is:" + c);
    }
  }
}
