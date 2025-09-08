package ingress.lesson2;

import java.util.Arrays;

public class LostElement {

  public static void main(String[] args) {
    int[] arr = {1,3,3,4,5,6};
    //1,4,3,4,5,6
    //System.out.println(findLostElement(arr));
    System.out.println(Arrays.toString(findLostAndDuplicateElement(arr, 6)));
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

  public int findDuplicateElement(int[] arr) {
    // 1,3,4,5,3,6
     int slow = arr[0];
     int fast = arr[0];


     return 0;
  }

  public static int[] findLostAndDuplicateElement1(int[] arr, int n) {
    // find sum of n digits

    //1,3,3,4,5,6
    //the sum of n -> 1,2,3,4,5,6-> 21
    // the sum of current array -> 22
    // duplicated element is 3 and the lost element is 2
    // lost element = duplicated element - |nsum-arrSum|
    int nSum = (n*(n+1))/2;
    //1,2,3,4,1



    int arrSum = 0;
    for (int j : arr) {
      arrSum += j;
    }



    return null;


  }


  //1,2,3,5,5,7 -> 5 is duplicate element and 6 is lost element.

  public static int[] findLostAndDuplicateElement(int[] arr, int n) {
      int lost = -1;
      int duplicate = -1;
      for (int i = 1; i < arr.length; i++) {
          if (arr[i] - arr[i-1] > 1) {
              duplicate = arr[i];
              lost = arr[i] - 1;
          }
      }

      return new int[]{lost, duplicate};


//     int first = arr[0];
//     int last = arr[n-1];
//     int sum = ((first * last)/2) * n;
//
//     return null;
  }






  // TODO find it
//  public static int[] findLostAndDuplicateElement(int[] arr, int n) {
//    int nSum = (n * (n+1))/2;
//    System.out.println("nSum - "+nSum);
//    int currentSum = 0;
//    for (int j : arr) {
//      currentSum += j;
//    }
//    System.out.println("currentSum - "+currentSum);
//    int lostElement = currentSum;
//    for(int i = 1; i <= n; i++ ) {
//      if (lostElement - i < 0) {
//         break;
//      }
//      lostElement = lostElement - i;
//    }
//    System.out.println(lostElement);
//    int duplicatedElement = currentSum - (nSum - lostElement);
//    return new int[]{duplicatedElement, lostElement};
//  }

}
