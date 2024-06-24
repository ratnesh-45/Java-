import java.util.*;

public class Function_overloading_datatype {
  // add 2 nos intger value:-
  public static int sum(int a, int b) {
    return a + b;
  }

  // add 2 nos ifloat value:-
  public static float sum(float a, float b) {
    return a + b;
  }

  public static void main(String args[]) {
    System.out.println(sum(12, 23));
    System.out.println(sum(3.2f, 4.8f));
  }
}
