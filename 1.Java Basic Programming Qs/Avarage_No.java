import java.util.*;

public class Avarage_No {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // Avarage of Given Three No:-
    System.out.print("Enter the 1st number:-");
    int a = sc.nextInt();
    System.out.print("Enter the 2nd number:-");
    int b = sc.nextInt();
    System.out.print("Enter the 3rd number:-");
    int c = sc.nextInt();

    int sum = (a + b + c);
    int Avg = sum / 3;

    System.out.print("Avarage of Three Number:-" + Avg);
  }
}
