import java.util.*;

public class _4_r_table {
  public static void main(String[] args) {

    // 4. Write a program to print reverse tables.

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the reverse n table Number:-");
    int n = sc.nextInt();

    for (int i = 10; i >= 1; i--) {
      System.out.println(n + "*" + i + "=" + n * i);
    }
  }
}
