import java.util.Scanner;

public class ArithmeticProgression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth Terms: ");
        int n = sc.nextInt();

        arithmetic(n);
    }

    public static void arithmetic(int n) {
        int s1 = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(s1 + " ");
            s1 += 1;
        }
        System.out.println();

        int s2 = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(s2 + " ");
            s2 += 2;
        }
        System.out.println();

        int s3 = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(s3 + " ");
            s3 += 4;
        }
        System.out.println();

        int s4 = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(s4 + " ");
            s4 += 6;
        }
    }
}
