package ingress.lesson2;

import java.util.Arrays;

public class LeftShift {

  public static void main(String[] args) {
    int[] arr =  {1,2,3,4,5};
    leftShift(arr);
    System.out.println(Arrays.toString(arr));
  }



  public static void leftShift(int[] arr) {
    int firstElement = arr[0];
    for (int i = 1; i < arr.length; i++) {
      arr[i-1] = arr[i];
    }
    arr[arr.length - 1] = firstElement;
  }

  public static void leftShiftNthFirstWay(int[] arr, int n) {
     while (n > 0) {
       leftShift(arr);
       n--;
     }
  }

  public static int[] leftShiftNthSecondWay(int[] arr, int n) {
     int[] res = new int[arr.length];
     for (int i = 0; i < arr.length; i++) {
       res[i] = arr[(i+n)%arr.length];
     }
     return res;
  }

}
