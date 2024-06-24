import java.util.*;

public class _22_check_triangle {
  public static void main(String[] args) {
    // 30. Write a program to check whether a triangle is valid or not, when the
    // three angles of the triangle are entered through the keyboard. A triangle is
    // valid if the sum of all the three angles is equal to 180 degrees.

    Scanner sc = new Scanner(System.in);
    System.out.print("Take the Three angles:-");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int sum = a + b + c;
    if (sum == 180) {
      System.out.println("Triangle is valid");
    } else {
      System.out.println("Triangle is Not valid");
    }
  }

}
