import java.util.Scanner;

public class _23_hexa_to_dec {

  public static int HexaTOdec(int n) {
    int A = 11;
    int digit;
    int decNum = 0;
    int pow = 0;

    while (n > 0) {
      digit = n % 10;
      decNum = decNum + digit * (int) Math.pow(16, 0);
      n = n / 10;
    }
    return decNum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Hexa-decimal Number:-");
    int n = sc.nextInt();
    HexaTOdec(n);
  }

}
