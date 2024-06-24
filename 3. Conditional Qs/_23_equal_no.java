import java.util.*;

public class _23_equal_no {
  public static void main(String[] args) {
    // 36. Write a Java program that accepts three numbers and check All numbers are
    // equal or not.

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Three Nos:-");
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();

    if (x == y && y == z && z == x) {
      System.out.println("All Numbers are Equal.");
    } else {
      System.out.println("All Numbers are Not Equal.");
    }

  }
}
