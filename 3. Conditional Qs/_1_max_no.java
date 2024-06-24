import java.util.*;

public class _1_max_no {
  public static void main(String args[]) {
    // Write a program to find max bet two nos.
    Scanner sc = new Scanner(System.in);
    System.out.print("Take the 1st no:-");
    int a = sc.nextInt();
    System.out.print("Take the 2nd no:-");
    int b = sc.nextInt();

    if (a > b) {
      System.out.println("Maximum No:-" + a);
    } else {
      System.out.println("Maximum No:-" + b);
    }
  }
}
