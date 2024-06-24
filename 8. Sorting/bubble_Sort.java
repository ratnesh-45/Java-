import java.util.*;

public class bubble_Sort {

  public static void bubbleSort(int num[]) {
    for (int turn = 0; turn < num.length - 1; turn++) {
      for (int j = 0; j < num.length - 1 - turn; j++) {
        if (num[j] > num[j + 1]) {
          // swap method
          int temp;
          temp = num[j];
          num[j] = num[j + 1];
          num[j + 1] = temp;
        }
      }
    }
  }

  public static void printNum(int num[]) {
    for (int i = 0; i < num.length; i++) {
      System.out.print( num[i] + " ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 5 Numbers:-");
    int num[] = new int[5];
    for (int i = 0; i < num.length; i++) {
      num[i] = sc.nextInt();
    }
    bubbleSort(num);
    printNum(num);

  }

}
