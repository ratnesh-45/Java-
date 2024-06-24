
import java.util.*;

public class _15_reverse_no {
  public static void main(String[] args) {
    // 15. write a program to reverse the given Digits.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Digit:-");
    int digit = sc.nextInt();

    int rev = 0;
    while (digit > 0) {
      rev = rev * 10 + digit % 10;
      digit = digit / 10;
    }
    System.out.println("Reverse Digit is:" + rev);
  }
}
