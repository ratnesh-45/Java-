import java.util.*;

public class average_number {

  public static double averageNum(double a, double b, double c) {
    double totalNum = (a + b + c);
    double avg = totalNum / 3;
    return avg;
  }

  public static void main(String[] args) {
    // Question 1 : Write a Java method to compute the average of three numbers..
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Three Numbers:-");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    System.out.println("Average of 3 Nos:" + averageNum(a, b, c));

  }
}
