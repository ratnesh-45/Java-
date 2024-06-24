import java.util.*;

public class inverted_star_pattern {
  public static void main(String[] args) {
    // print inverted star pattern.

    for (int i = 4; i >= 1; i--) {
      for (int j = i; j >= 1; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
