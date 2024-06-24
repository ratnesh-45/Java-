import java.util.*;

public class Calculator {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // Make the Arithmetic Calculator:-
    System.out.print("Enter the 1st Number:-");
    int a = sc.nextInt();
    System.out.print("Enter the 2nd Number:-");
    int b = sc.nextInt();
    System.out.print("Enter the your operator:-");
    char operators = sc.next().charAt(0);

    switch (operators) {
      case '+':
        System.out.println("Sum:-" + (a + b));
        break;
      case '-':
        System.out.println("Sub:-" + (a - b));
        break;
      case '*':
        System.out.println("Multi:-" + (a * b));
        break;
      case '/':
        System.out.println("Sum:-" + (a / b));
        break;
      case '%':
        System.out.println("Sum:-" + (a % b));
        break;
      default:
        System.out.println("none");
    }

  }
}
