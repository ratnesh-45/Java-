import java.util.*;

public class max_subarray_sum {

  public static void maxSubarraySum(int numbers[]) {
    int maxSum = Integer.MIN_VALUE;
    int curr = 0;
    for (int i = 0; i < numbers.length; i++) {
      int start = i;
      for (int j = i; j < numbers.length; j++) {
        curr = 0;
        int end = j;
        for (int k = start; k <= end; k++) {
          // print maxsum subarray:-
          curr += numbers[k];
        }
        System.out.println(curr);
        if (maxSum < curr) {
          maxSum = curr;
        }

      }
    }
    System.out.println("Max value is:" + maxSum);

  }

  public static void main(String args[]) {
    int numbers[] = { 2, 4, 6, 8, 10 };
    maxSubarraySum(numbers);

  }
}
