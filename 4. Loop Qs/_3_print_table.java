import java.util.*;

public class _3_print_table {
  public static void main(String[] args) {

    // 3. Write a program to print tables.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the n Table Number:-");
    int n = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(n + "*" + i + "=" + n * i);
    }
  }
}
