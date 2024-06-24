import java.util.*;

public class kadanes_method_maxSubarraySum {

  public static void kadanes(int numbers[]) {
    int ms = Integer.MIN_VALUE;
    int cs = 0;

    for (int i = 0; i < numbers.length; i++) {
      cs += numbers[i];
    }
    if (cs < 0) {
      cs = 0;
    }
    ms = cs;  
    System.out.println("Our Max subarray sum:" + ms);
  }

  public static void main(String[] args) {
    int numbers[] = { 2, 4, 6, 8, 10 };
    kadanes(numbers);
  }
}
