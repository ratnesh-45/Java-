import java.util.*;

public class Even {
  public static void main(String args[]) {
    // print Even number 1 to 10 without nos:-4,6,8.
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        if (i == 4 || i == 6 || i == 8) {
          continue;

        }
        System.out.println(i);
      }

    }
  }
}
