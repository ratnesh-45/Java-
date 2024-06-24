import java.util.*;

public class _19_percentage_marks {
  public static void main(String[] args) {
    // 19. Write a program to input marks of five subjects Physics, Chemistry,
    // Biology, Mathematics and Computer. Calculate percentage and grade according
    // to following:
    Scanner sc = new Scanner(System.in);
    System.out.print("Inout the mark of physics:-");
    int phy = sc.nextInt();
    System.out.print("Inout the mark of chemistry:-");
    int chem = sc.nextInt();
    System.out.print("Inout the mark of Biology:-");
    int bio = sc.nextInt();
    System.out.print("Inout the mark of Mathematics:-");
    int math = sc.nextInt();
    System.out.print("Inout the mark of Computer:-");
    int comp = sc.nextInt();

    int total_marks = (phy + chem + bio + math + comp);
    int percentage = total_marks / 5;
    System.out.println("Total :" + total_marks);
    System.out.println("Percentage :" + percentage);

    if (percentage >= 90) {
      System.out.println("Grade A");
    } else if (percentage >= 80) {
      System.out.println("Grade B");
    } else if (percentage >= 70) {
      System.out.println("Grade C");
    } else if (percentage >= 60) {
      System.out.println("Grade D");
    } else if (percentage >= 40) {
      System.out.println("Grade E");
    } else {
      System.out.println("Grade F");

    }
  }
}
