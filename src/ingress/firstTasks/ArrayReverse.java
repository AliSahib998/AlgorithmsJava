package ingress.firstTasks;

import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
    int[] arr =  {1,2,3,4,5};
    reverseArray(arr);
    System.out.println(Arrays.toString(arr));
  }


  static void reverseArray(int[] arr) {
    //1,2,3,4,5
    //5,4,3,2,1

    for (int i = 0; i < arr.length/2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }
}
