package ingress.lesson2;

import java.util.Arrays;

public class RotateArray {

  public static void main(String[] args) {
    int [] arr =  {1,2,3,4,5};
    rotateArray(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void rotateArray(int[] a) {
    int length = a.length;
     for(int i = 0; i < a.length / 2; i++) {
        int temp = a[i];
        a[i] = a[length - i - 1];
        a[length - i - 1] = temp;
     }
  }
}
