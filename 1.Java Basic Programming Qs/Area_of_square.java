import java.util.*;

public class Area_of_square {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // calculate the Area of square:-
    System.out.print("Enter the side of square:-");
    int s = sc.nextInt();

    int Area = (s * s);
    System.out.print("Area of Square:-" + Area);
  }
}
