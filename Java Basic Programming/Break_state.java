import java.util.*;

public class Break_state {
  public static void main(String args[]) {
    // Jump the loop using break:-
    for (int i = 1; i <= 5; i++) {
      if (i == 3) {
        break;
      }
      System.out.println(i);
    }
    System.out.println("I'm out to loop");
  }
}
