import java.util.*;

public class input_output {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int marks[] = new int[20];

    // input:-
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();

    // output:-
    System.out.println("Physics: " + marks[0]);
    System.out.println("Physics: " + marks[1]);
    System.out.println("Physics: " + marks[2]);

    // update:-
    marks[2] = 45;
    System.out.println("Physics: " + marks[2]);

    // Length of Arrays:-
    System.out.println("Length of array: " + marks.length);

  }
}
