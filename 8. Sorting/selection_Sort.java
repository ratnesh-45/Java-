import java.util.*;

public class selection_Sort {
  public static void selectionSort(int num[]) {
    for (int i = 0; i < num.length - 1; i++) {
      int minPos = i;
      for (int j = i + 1; j < num.length; j++) {
        if (num[minPos] > num[j]) {
          minPos = j;
        }
      }
      // swap:
      int temp;
      temp = num[minPos];
      num[minPos] = num[i];
      num[i] = temp;
    }
  }

  public static void printNum(int num[]) {
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 5 Number:-");
    int num[] = new int[5];
    for (int i = 0; i < num.length; i++) {
      num[i] = sc.nextInt();
    }
    selectionSort(num);
    printNum(num);
  }
}
