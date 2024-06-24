import java.util.*;

public class _8_check_vowel {
  public static void main(String[] args) {

    // 8. Write a program to input any alphabet and check whether it is vowel or
    // consonant.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Letter:-");
    char letter = sc.next().charAt(0);

    switch (letter) {
      case 'a':
        System.out.println("This letter is Vowel");
        break;
      case 'e':
        System.out.println("This letter is Vowel");
        break;
      case 'i':
        System.out.println("This letter is Vowel");
        break;
      case 'o':
        System.out.println("This letter is Vowel");
        break;
      case 'u':
        System.out.println("This letter is Vowel");
        break;
      default:
        System.out.println("This is Consonant.");
    }
  }
}
