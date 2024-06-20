import java.util.*;

public class else_if_statement {
  public static void main(String args[]) {
    // else-if statement:-
    int age = 13;
    if (age >= 18) {
      System.out.println("Adult");
    } else if (age >= 13 && age < 18) {
      System.out.println("Teenager");
    } else {
      System.out.println("child");
    }
  }
}
