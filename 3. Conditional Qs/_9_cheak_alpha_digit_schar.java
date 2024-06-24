import java.util.*;

public class _9_cheak_alpha_digit_schar {
  public static void main(String[] args) {
    // 9. Write a program to input any character and check whether it is alphabet,
    // digit or special character.
    Scanner sc = new Scanner(System.in);
    System.out.print("Take the character:-");
    char ch = sc.next().charAt(0);

    if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
      System.out.println("This is a Alphabet");
    } else if (ch >= '0' && ch <= '9') {
      System.out.println("This is a Number");
    } else {
      System.out.println("This is a Special Character");
    }
  }
}
