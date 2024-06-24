import java.util.*;

public class Table {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // print the table any +ve Number:-
    System.out.print("Enter the +ve Number:-");
    int n = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(n + "*" + i + "=" + n * i);

    }
  }
}
