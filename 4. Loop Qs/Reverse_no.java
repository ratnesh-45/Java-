import java.util.*;

public class Reverse_no {
  public static void main(String args[]) {
    // print the reverse Number:-
    // int n = 10943;
    int n =3421;
    int rev = 0;
    while (n > 0) {
      rev = rev * 10 + n % 10;
      n = n / 10;
    }
    System.out.println("Reverse Number is:" + rev);
  }
}
