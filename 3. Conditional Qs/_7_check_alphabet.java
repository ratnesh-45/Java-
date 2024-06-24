import java.util.*;

public class _7_check_alphabet {
  public static void main(String args[]) {
    // 7.Write a program to check whether a character is alphabet or not.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Character:-");
    char ch = sc.next().charAt(0);

    if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
      System.out.println("This is Alphabet.");
    } else {
      System.out.println("This is Not Alphabet.");
    }

  }
}
