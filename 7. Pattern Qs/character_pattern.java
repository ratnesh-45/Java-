
public class character_pattern {
  public static void main(String[] args) {
    // print character pattern:-
    char ch = 'A';
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }
}
