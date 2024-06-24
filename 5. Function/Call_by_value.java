import java.util.*;

public class Call_by_value {
  public static void swap(int a, int b) {
    // swap:- change the value.
    int temp = a;
    a = b;
    b = temp;
    System.out.println("a:-" + a);
    System.out.println("b:-" + b);

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Value of a:");
    int a = sc.nextInt();
    System.out.print("Enter the Value of b:");
    int b = sc.nextInt();
    swap(a, b);

  }
}
