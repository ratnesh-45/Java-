import java.util.*;

public class _24_caculator {
  public static void main(String[] args) {
    // 39. Write a Java program to create a simple calculator.

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the 1st Number:-");
    int x = sc.nextInt();
    System.out.print("Enter the 1st Number:-");
    int y = sc.nextInt();

    System.out.print("Enter the operator(+,-,*,/,%):-");
    int op = sc.next().charAt(0);

    switch (op) {
      case '+':
        System.out.println("Sum: " + (x + y));
        break;
      case '-':
        System.out.println("Sub: " + (x - y));
        break;
      case '*':
        System.out.println("Multi: " + (x * y));
        break;
      case '/':
        System.out.println("Div: " + (x / y));
        break;
      case '%':
        System.out.println("Modul: " + (x % y));
        break;

      default:
        System.out.println("invalid operator.");
        break;
    }
  }
}
