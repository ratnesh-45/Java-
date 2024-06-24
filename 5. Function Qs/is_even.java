import java.util.Scanner;

public class is_even {

  public static boolean isEven(int num) {
    if (num % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    /*
     * Question 2 : Write a method named isEven that accepts an int argument. The
     * method should return true if the argument is even, or false otherwise. Also
     * write a program to test your method.
     */
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int n = sc.nextInt();
    if (isEven(n)) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
    sc.close();
  }
}
