import java.util.*;

public class Largest_no {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // Calculate the largest number:-
    System.out.print("Enter the 1st number:-");
    int num1 = sc.nextInt();
    System.out.print("Enter the 2nd number:-");
    int num2 = sc.nextInt();

    if (num1 >= num2) {
      System.out.println(num1);
    } else {
      System.out.println(num2);
    }
  }
}
