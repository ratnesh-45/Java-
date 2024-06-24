import java.util.*;

public class Break_Qs {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // Keep entering number till user enters a multiple of 10.

    do {
      System.out.print("Enter the Number:-");
      int n = sc.nextInt();
      if (n % 10 == 0) {
        break;
      }
      System.out.println(n);
    } while (true);
System.out.print("Program succussful");
  }
}
