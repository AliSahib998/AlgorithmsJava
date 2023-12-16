package ingress.firstTasks;

import java.util.Arrays;

public class ArrayLeftShift {
  public static void main(String[] args) {
     int[] arr = {1,2,3,4,5};
     //leftShift(arr);
    System.out.println(Arrays.toString(leftShiftNth(3, arr)));
    //System.out.println(Arrays.toString(arr));
  }

  static int[] leftShiftNth(int d, int [] arr) {
    //implement it
    int[] res = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      res[i] = arr[(i+d) % arr.length];
    }

    return res;
  }

  static void leftShift(int[] arr) {

    //1,2,3,4,5
    //2,3,4,5,1
    //
    int first = arr[0];
    System.arraycopy(arr, 1, arr, 0, arr.length - 1);

    arr[arr.length-1] = first;
  }
}
