import java.util.*;

public class product_code {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    //calculate product of two number:-
    System.out.print("Enter the 1st Number:-");
    int a = sc.nextInt();
    System.out.print("Enter the 2nd Number:-");
    int b = sc.nextInt();

    int product = a * b;
    System.out.print("product is:- " + product);

  }
}