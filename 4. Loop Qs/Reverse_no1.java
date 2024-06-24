import java.util.*;

public class Reverse_no1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // print reverse number using while loop.
    // enter the input user:-
    System.out.print("Enter the Number:-");
    int n = sc.nextInt();

    int rev = 0;
    while (n > 0) {
      rev = rev * 10 + n % 10;
      n = n / 10;
    }
    System.out.println("Reverse Number is:" + rev);
  }
}
