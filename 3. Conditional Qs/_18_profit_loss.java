import java.util.*;

public class _18_profit_loss {
  public static void main(String[] args) {

    // 18. Write a program to calculate profit or loss.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the cost price:-");
    int c_price = sc.nextInt();
    System.out.print("Enter the selling price:-");
    int s_price = sc.nextInt();

    if (c_price < s_price) {
      int profit = s_price - c_price;
      System.out.println("Profit is:" + profit);
    } else if (c_price > s_price) {
      int loss = c_price - s_price;
      System.out.println("Loss is:" + loss);
    } else {
      System.out.println("No profit and no loss.");
    }
  }
}
