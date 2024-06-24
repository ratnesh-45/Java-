import java.util.*;

public class _21_gross_salary {
  public static void main(String[] args) {
    // 20. Write a program to input basic salary of an employee and calculate its
    // Gross salary according to following:

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the employee salary:-");
    int salary = sc.nextInt();

    double hra, da, g_salary;
    if (salary <= 10000) {
      hra = salary * 0.2f;
      da = salary * 0.8f;
    } else if (salary <= 20000) {
      hra = salary * 0.25f;
      da = salary * 0.9f;
    } else {
      hra = salary * 0.3f;
      da = salary * 0.95f;
    }
    g_salary = salary + hra + da;
    System.out.print("Gross salary of employee:-" + g_salary);

  }
}
