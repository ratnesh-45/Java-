import java.util.*;

public class _6_leap_year {
  public static void main(String args[]) {
    // Write a program to check whether a year is leap year or not.
    Scanner sc = new Scanner(System.in);
    System.out.print("Take the year:-");
    int year = sc.nextInt();

    if (year % 4 == 0 && (year % 400 == 0 || year % 100 == 0)) {
      System.out.println("This year is Leap year.");
    } else {
      System.out.println("This year is Not Leap year.");
    }
  }
}
