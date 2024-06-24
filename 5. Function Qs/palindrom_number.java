import java.util.*;

public class palindrom_number {

  public static void palindromNum(int n) {
    int rev = 0;
    int temp=n;
    while (n > 0) {
      rev = rev * 10 + n % 10;
      n = n / 10;
      
    }
    if (temp == rev) {
      System.out.println("It's Palindrom Number.");
    } else {

      System.out.println("It's Not Palindrom Number.");
    }

  }

  public static void main(String[] args) {
    /*
     * Question 3 : Write a Java program to check if a number is a palindrome in
     * Java? ( 121 is a
     * palindrome, 321 is not)
     */
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the NUmber:-");
    int n = sc.nextInt();
    palindromNum(n);
  }
}
