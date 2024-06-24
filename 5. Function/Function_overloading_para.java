import java.util.*;

public class Function_overloading_para {
  // 1st function calculate the two number:-
  public static int sum(int a, int b) {
    return a + b;
  }

  // 2nd function calculate the three number:-
  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String args[]) {
    System.out.println(sum(3, 4));
    System.out.println(sum(3, 2, 1));
  }
}
