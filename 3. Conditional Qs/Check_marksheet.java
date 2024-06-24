import java.util.*;

public class Check_marksheet {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the marks:-");
    int marks = sc.nextInt();

    String reportcard = (marks >= 33) ? "Pass" : "Fail";
    System.out.print(reportcard);

  }
}
