import java.util.*;

public class Natural_no {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // print the sum of nth natural Number:-
    System.out.print("Take the nth Natural Number:-");
    int n = sc.nextInt();
    int sum = 0;
    int i = 1;
    while (i <= n) {
      sum = sum + i;
      i++;

    }
    System.out.print("Sum of nth Natural Number:-" + sum);
  }
}
