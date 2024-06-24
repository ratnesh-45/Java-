import java.util.*;

public class _10_char_upper_to_lower {
  public static void main(String[] args) {
    // 10. Write a program to check whether a character is uppercase or lowercase
    // alphabet.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Character:-");
    char ch = sc.next().charAt(0);

    if (ch >= 65 && ch <= 90) {
      System.out.println("This is uppercase alphabet.");
    } else {
      System.out.println("This is lowercase alphabet.");
    }
  }
}
