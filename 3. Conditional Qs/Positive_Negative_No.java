import java.util.*;

public class Positive_Negative_No {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // Check The Number +ve or -ve:-

    System.out.print("Input the Number:-");
    int Number = sc.nextInt();
    if (Number > 0) {
      System.out.println("Postive Number");
    } else {
      System.out.println("Negative Number");
    }

  }
}
