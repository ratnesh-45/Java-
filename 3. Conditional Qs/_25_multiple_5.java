import java.util.*;

public class _25_multiple_5 {
  public static void main(String[] args) {
    // 40. Write a Java program to check whether the given integer is a multiple of
    // 5.

    Scanner sc = new Scanner(System.in);
    System.out.print("Take the Number:-");
    int num = sc.nextInt();

    if (num % 5 == 0) {
      System.out.println(num + " is a multiple of 5");
    } else {
      System.out.println(num + " is a  Not multiple of 5");
    }
  }
}
