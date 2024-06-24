import java.util.*;

public class Largest_Three_no {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // Calculate the largest of 3 numbers:-
    System.out.print("Enter the 1st Nos:-");
    int num1 = sc.nextInt();
    System.out.print("Enter the 2nd Nos:-");
    int num2 = sc.nextInt();
    System.out.print("Enter the 3rd Nos:-");
    int num3 = sc.nextInt();

    if (num1 >= num2 && num1 >= num3) {
      System.out.println(num1);
    } else if (num2 >= num3 && num2 >= num3) {
      System.out.println(num2);
    } else {
      System.out.println(num3);
    }
  }
}
