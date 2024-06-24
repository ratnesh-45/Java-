import java.util.*;

public class Week_days {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // print the week day using switch case:-

    System.out.print("Input the Week day Number:-");
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
        System.out.println("None");
    }
  }

}
