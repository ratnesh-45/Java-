import java.util.*;

public class first_1 {

  public static int firstN(int numbers[], int key) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == key) {
        return i;
      }
    }
    return -1;

  }

  public static void main(String[] args) {
 
    int numbers[] = { 2, 4, 6, 8, 10 };
    int key = 6;
    int index = firstN(numbers, key);
    if (index == -1) {
      System.out.println("not found");
    } else {
      System.out.println("index is:" + index);
    }
  }
}
