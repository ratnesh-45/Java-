import java.util.*;

public class Product_a_b {

  public static int product(int a, int b) {
    int prod = a * b;
    return prod;

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Take the 1st Number:-");
    int a = sc.nextInt();
    System.out.print("Take the 2nd Number:-");
    int b = sc.nextInt();
    int multiply = product(a, b);
    System.out.println("Product is:" + multiply);
  }
}
