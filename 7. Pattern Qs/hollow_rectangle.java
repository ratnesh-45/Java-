import java.util.Scanner;

public class hollow_rectangle {

  public static void hollowRectangle(int rows, int cols) {
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= cols; j++) {
        if (i == 1 || i == rows || j == 1 || j == cols) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the rows of hollow rectangle:-");
    int r = sc.nextInt();
    System.out.print("Enter the cols of hollow rectangle:-");
    int c = sc.nextInt();
    hollowRectangle(r, c);
  }
}
