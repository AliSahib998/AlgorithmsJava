package ingress.firstTasks;

import java.util.Arrays;

public class LostElement {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5}; //O(N), O(1)
        //System.out.println(findLostElement(arr, 5));
        int[] arr1 = {1,2,2,4,5};
        System.out.println(Arrays.toString(findLostElementAndDuplicate(arr1, 5)));
    }

    public static int findLostElement(int[] arr, int n) {
        int sum = (n * (n+1))/2;
        int arrSum = 0 ;
        for (int j : arr) {
            arrSum += j;
        }
        return sum - arrSum;
    }

    public static int[] findLostElementAndDuplicate(int[] arr, int n) {
        //int[] arr1 = {1,2,2,4,5};
        //return [6,3]
        int sum = (n * (n+1))/2;
        int arrSum = 0 ;
        int temp = -1;
        int index = -1;
        for (int j : arr) {
            if (temp == j)  {
                index = j;
            } else {
                temp = j;
                arrSum += j;
            }
        }

        return new int[]{arr[index], sum-arrSum};
    }
}
