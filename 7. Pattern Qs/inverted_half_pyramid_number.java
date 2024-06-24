import java.util.*;

public class inverted_half_pyramid_number {

  public static void invertedHalfpyramidNumber(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number:-");
    int n = sc.nextInt();
    invertedHalfpyramidNumber(n);
  }
}
