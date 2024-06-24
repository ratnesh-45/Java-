import java.util.*;

public class Continue_Qs {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    do {
      System.out.print("Enter the Number:-");
      int n = sc.nextInt();

      if (n % 10 == 0) {
        continue;
      }
      System.out.println("Number was:-" + n);
    } while (true);
  }
}
