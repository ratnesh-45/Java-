import java.util.*;

public class _16_check_triangle {
  public static void main(String[] args) {
    // 16. Write a program to check whether the triangle is equilateral, isosceles
    // or scalene triangle.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the three sides of the triangle:-");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a == b && b == c ) {
      System.out.println("This is an equilateral Triangle.");
    } else if (a == b || b == c || c == a) {
      System.out.println("This is an isosceles Triangle.");
    } else {
      System.out.println("This is a scalene Triangle.");
    }
  }
}
