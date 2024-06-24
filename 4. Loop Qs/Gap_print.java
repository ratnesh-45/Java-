import java.util.*;

public class Gap_print {
  //print jump the number using for loop:-
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number:-");
    int n = sc.nextInt();
    for (int i = 1; i <= 100; i++) {
      if (i == n) {
        continue;
      }
      System.out.print(i + " ");
    }
  }
}
