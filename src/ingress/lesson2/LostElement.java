package ingress.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LostElement {

  public static void main(String[] args) {
    int[] arr = {1,3,3,3,5,6};
    //1,4,3,4,5,6
    //System.out.println(findLostElement(arr));
    System.out.println(findMissingElements(arr, 6));
  }

  public static int findLostElement(int[] arr) {
    int lastElement = arr[arr.length-1];
    int nSum = (lastElement*(lastElement+1))/2;
    int currentSum = 0;
    for (int j : arr) {
      currentSum += j;
    }
    return nSum-currentSum;
  }


    /**
       time O(N)
       memory O(N)
     */
  public static List<Integer> findMissingElements1(int[] arr, int n) {
      for (int i = 0; i < n; i++) {
          int element = arr[i] - 1;
          if (arr[element] > 0) {
              arr[element] = -1 * arr[element];
          }
      }
      List<Integer> missed = new ArrayList<>();
      for(int i = 0; i < n; i++) {
          if(arr[i] > 0) {
              missed.add(arr[i]);
          }
      }

      return missed;
  }

  public static List<Integer> findMissingElements(int[] arr, int n) {
      for (int i = 0; i < n; i++) {
          if (arr[i] - 1 != i) {
              int index = arr[i] - 1;
              if (arr[index] != arr[i]) {
                  int temp = arr[i];
                  arr[i] = arr[index];
                  arr[index] = temp;
              }
          }
      }
      List<Integer> missed = new ArrayList<>();
      for (int i = 0; i < n; i++) {
          if (i + 1 != arr[i]) {
              missed.add(i + 1);
          }
      }

      return missed;
  }

  public static int[] findLostAndDuplicateElement(int[] arr, int n) {
      //example
      // 1,2,3,4,5 it is original array
      // 1,2,3,3,5 it is given array where 3 is duplicated and 4 is lost element.
      //the sum
      int nSum = (n * (n+1))/2; //15

      return null;
  }

}
