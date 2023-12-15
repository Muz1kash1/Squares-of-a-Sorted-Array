package org.example;

import java.util.Arrays;

public class SquareSortedArrayInPlace {
  public static void main(String[] args) {
    int[] nums = {-5, -3, 3, 4, 5};

    System.out.println(Arrays.toString(nums));


    System.out.println(Arrays.toString(sortedSquares(nums)));
  }

  /**
   * Я не нашёл метода это решить без использования временного массива result как ты указывал в условии, точнее нашёл,
   * но он будет работать только для отсортированного в обратном порядке и где то O(2n), так что сдаю вот так.
   */
  public static int[] sortedSquares(int[] nums) {

    int[] result = new int[nums.length];
    int i = 0;
    int temp1 = nums.length - 1;
    int temp2 = nums.length - 1;

    while (temp2 >= 0) {
      if (Math.abs(nums[i]) > Math.abs(nums[temp1])) {
        result[temp2--] = nums[i] * nums[i++];
      } else {
        result[temp2--] = nums[temp1] * nums[temp1--];
      }
    }

    return result;
  }

}

