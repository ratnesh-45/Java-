import java.util.*;

public class _17_quardratic_equation {
  public static void main(String[] args) {
    // 17. Write a program to find all roots of a quadratic equation.

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the three numbers of the quadratic equation (a, b, c): ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    double b_pow = Math.pow(b, 2);
    double d = b_pow - (4 * a * c);

    double D = Math.sqrt(d);
    double root1 = (-b + D) / (2 * a);
    double root2 = (-b - D) / (2 * a);
    System.out.println("Roots are real and different:");
    System.out.println("Root 1: " + root1);
    System.out.println("Root 2: " + root2);

  }
}
