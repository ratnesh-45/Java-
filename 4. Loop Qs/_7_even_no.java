import java.util.*;

public class _7_even_no {
  public static void main(String[] args) {

    // 7. Write a program to print all even numbers between 1 to 100.

    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
