import java.util.*;

public class Check_temp {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // check the Human temprature:-
    System.out.print("Enter the Human Temprature:-");
    double temp = sc.nextDouble();

    if (temp >= 100) {
      System.out.print("You have a fever");
    } else {
      System.out.print("You don't have a fever");
    }
  }
}
