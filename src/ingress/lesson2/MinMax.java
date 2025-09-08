package ingress.lesson2;

public class MinMax {

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    System.out.println(findMaxElement(arr));
    System.out.println(findMinElement(arr));
  }

  public static int findMaxElement(int[] arr) {
    int max = arr[0];
    for(int i = 1; i < arr.length; i++) {
      if(max < arr[i]) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int findMinElement(int[] arr) {
    int min = arr[0];
    for(int i = 1; i < arr.length; i++) {
      if(min > arr[i]) {
        min = arr[i];
      }
    }
    return min;
  }

}
