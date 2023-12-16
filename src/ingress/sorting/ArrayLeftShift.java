package ingress.sorting;

import java.util.Arrays;

public class ArrayLeftShift {
  public static void main(String[] args) {
     int[] arr = {1,2,3,4,5};
     leftShift(arr);
    System.out.println(Arrays.toString(arr));
  }


  static void leftShift(int[] arr) {

    //1,2,3,4,5
    //2,3,4,5,1
    //
    int first = arr[0];
    for (int i = 1; i < arr.length; i++) {
      arr[i-1] = arr[i];
    }

    arr[arr.length-1] = first;
  }
}
