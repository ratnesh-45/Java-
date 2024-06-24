import java.util.Scanner;

public class _15_triangle_valid_or_not {
    public static void main(String[] args) {
        // 15. Write a program to input all sides of a triangle and check whether
        // triangle is valid or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st side of a Triangle: ");
        int a = sc.nextInt();
        System.out.print("Input 2nd side of a Triangle: ");
        int b = sc.nextInt();
        System.out.print("Input 3rd side of a Triangle: ");
        int c = sc.nextInt();

        // Check if the triangle is valid
        if ((a + b) > c) {
            if ((b + c) > a) {
                if ((a + c) > b) {
                    System.out.println("Triangle is valid.");
                } else {
                    System.out.println("Triangle is not valid.");
                }
            } else {
                System.out.println("Triangle is not valid.");
            }
        } else {
            System.out.println("Triangle is not valid.");
        }
    }
}
