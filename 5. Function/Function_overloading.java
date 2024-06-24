import java.util.*;

public class Function_overloading {
  // calculate the multiply of differnt no of parameter:-
  // function 1.
  public static void multiply(int a, int b) {
    int multi = a * b;
    System.out.println("multiply is:" + multi);
  }

  // function 2.
  public static void multiply(float a, float b) {
    float multi = a * b;
    System.out.println("multiply is:" + multi);
  }

  // function 3.
  public static void multiply(double a, double b) {
    double multi = a * b;
    System.out.println("multiply is:" + multi);
  }

  public static void main(String args[]) {
    multiply(1, 5);
    multiply(1.3, 5.2);
    multiply(12.43, 1.22);
  }
}
