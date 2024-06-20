import java.util.*;

public class GST_of_Item {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // gst of total Number of Three item to 18%.
    System.out.print("Enter the cost of pencil:-");
    float pencil = sc.nextFloat();
    System.out.print("Enter the cost of pen:-");
    float pen = sc.nextFloat();
    System.out.print("Enter the cost of eraser:-");
    float eraser = sc.nextFloat();

    float Total = (pencil + pen + eraser);
    // show of total bill:-
    System.out.println("Bill is:-" + Total);
    float gst = (Total * 18 / 100);
    // show the gst of total items:-
    System.out.println("gst:-" + gst);
    float newtotal = Total + gst;

    System.out.println("Total cost of items (include gst):-" + newtotal);
  }
}
