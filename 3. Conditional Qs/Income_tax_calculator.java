import java.util.*;

public class Income_tax_calculator {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // Find the Income tex :-

    System.out.print("Take the Your Income Amount:-");
    int income = sc.nextInt();
    int tax;

    if (income < 500000) {
      tax = (income * 0 / 100);
      System.out.println("Your income Tax is:" + tax);
    } else if (income > 500000 && income < 1000000) {
      tax = (income * 20 / 100);
      System.out.println("Your income Tax is:" + tax);
    } else {
      tax = (income * 30 / 100);
      System.out.println("Your income Tax is:" + tax);
    }
  }
}
