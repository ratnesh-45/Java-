import java.util.*;

public class Print_1_to_n {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // print Number 1 to nth no using while Loops:-
    System.out.print("Enter the nth Number:-");
    int num = sc.nextInt();

    int i = 1;
    while (i <= num) {
      System.out.println("No:" + i);
      i++;
    }
  }

}
