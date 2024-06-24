import java.util.*;

public class _8_odd_no {
  public static void main(String[] args) {
    //
    // 8. Write a program to print all odd number between 1 to 100.

    for (int i = 1; i <= 100; i++) {
      if (i % 2 != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
