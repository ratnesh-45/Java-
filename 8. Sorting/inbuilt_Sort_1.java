import java.util.Arrays; // Importing Arrays class
import java.util.Collections;

public class inbuilt_Sort_1 {

  public static void printArr(Integer arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println(); // Add newline for better readability
  }

  public static void main(String[] args) {
    Integer arr[] = {5, 4, 2, 1, 3};
    Arrays.sort(arr, Collections.reverseOrder());
    printArr(arr);
  }
}
