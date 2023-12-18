package org.example;

import java.util.Arrays;


public class SquareSortedArrayInPlace {
  public static void main(String[] args) {
    int[] nums = {-9999, -7, -5, 0, 1, 5, 700, 2000};

    System.out.println(Arrays.toString(nums));


    System.out.println(Arrays.toString(sortedSquares(nums)));
  }

  /**
   * Задачка оказалась проще если сначала написать ее на си а потом переписать на жаву на свежую голову ¯\_(ツ)_/¯ Но если
   * никогда в жизни не касаться плюсов додуматься до решения нереально
   *
   * @return отсортированный массив
   */
  public static int[] sortedSquares(int[] array) {
    int rightIndex = array.length - 1;

    while (rightIndex >= 0) {
      if (Math.abs(array[rightIndex]) >= Math.abs(array[0])) {
        array[rightIndex] *= array[rightIndex];
        rightIndex--;
      } else {
        array[rightIndex] ^= array[0];
        array[0] ^= array[rightIndex];
        array[rightIndex] ^= array[0];

        if (rightIndex != 1 && Math.abs(array[0]) < Math.abs(array[1])) {
          array[0] ^= array[1];
          array[1] ^= array[0];
          array[0] ^= array[1];
        }
      }
    }
    return array;
  }
}