import java.util.*;

public class Sum_with_para {

  public static void sum(int a, int b) {
    int sum = a + b;
    System.out.println("Sum of two Number:" + sum);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the 1st number:-");
    int a = sc.nextInt();
    System.out.print("Enter the 2nd number:-");
    int b = sc.nextInt();
    sum(a, b);

  }
}
