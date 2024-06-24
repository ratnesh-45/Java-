import java.util.*;

public class array_function_argument {
//print update marks using function argument.
  public static void update(int marks[]) {
    for (int i = 0; i < marks.length; i++) {
      marks[i] += 1;
    }
  }

  public static void main(String[] args) {
    int marks[] = { 23, 24, 25 };
    update(marks);

    for (int i = 0; i < marks.length; i++) {
      System.out.print( marks[i] + " ");
    }
  }
}
