import java.util.*;

public class Even_Odd_No {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // Calculate the even or odd number:-
    System.out.print("Enter the Number:-");
    int num = sc.nextInt();

    if (num % 2 == 0) {
      System.out.println("Even is " + num);
    } else {
      System.out.println("Odd is " + num);
    }
  }
}
