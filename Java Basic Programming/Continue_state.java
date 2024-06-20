import java.util.*;

public class Continue_state {
  public static void main(String args[]) {
    // print 1 to 10 using continue keyboard.
    for (int i = 1; i <= 10; i++) {
      if (i == 6) {
        continue;
      }
      System.out.println(i);
    }
  }
}
