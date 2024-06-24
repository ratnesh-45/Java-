import java.util.*;

public class _20_electricity_bill {
  public static void main(String[] args) {
    /*
     * 21. Write a program to input electricity unit charges and calculate total
     * electricity bill according to the given condition:
     * 
     * For first 50 units Rs. 0.50/unit
     * For next 150 units Rs. 0.75/unit
     * For next 250 units Rs. 1.20/unit
     * For unit above 250 Rs. 1.50/unit
     * An additional surcharge of 20% is added to the bill
     */
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Electricity uniy charges:-");
    int unit = sc.nextInt();
    float amt, surcharge, totalBill;
    if (unit >= 1 && unit <= 50) {
      amt = unit * .50f;
    } else if (unit >= 50 && unit <= 150) {
      amt = unit * .75f;
    } else if (unit >= 150 && unit <= 250) {
      amt = unit * 1.25f;
    } else {
      amt = unit * 1.50f;
    }
    
    surcharge = (amt * 0.2f);
    totalBill = amt + surcharge;
    System.out.println("Electricity bill is:" + totalBill);

  }
}
