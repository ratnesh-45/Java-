import java.util.*;

public class _11_week_day {
  public static void main(String[] args) {
    // 11. Write a program to input week number and print week day.
    Scanner sc = new Scanner(System.in);
    System.out.print("Take the Week day:-");
    int day = sc.nextInt();

    switch (day) {
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Thrusday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Saturday");
        break;

      default:
        System.out.println("Not Exits");
        break;
    }

  }
}
