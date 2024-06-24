import java.util.*;

public class _21_bin_to_dec {

  public static int binDec(int binNum) {
    int pow = 0;
    int decNum = 0;
    while (binNum > 0) {
      int lastDigit = binNum % 10;

      decNum = decNum + lastDigit * (int) Math.pow(2, pow);
      pow++;
      binNum = binNum / 10;

    }

    return decNum;

  }

  public static void main(String[] args) {
    // 22. Write a program to convert a binary number into a decimal number without
    // using array, function and while loop.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the binary Number:-");
    int n = sc.nextInt();

    System.out.println(binDec(n));

  }
}
