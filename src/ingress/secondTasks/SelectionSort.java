package ingress.secondTasks;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void selectionSort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
           int minIndex = i;
           for (int j = i+1; j < arr.length; j++) {
               if (arr[i] > arr[j]) {
                   minIndex = j;
               }
           }

           int temp = arr[i];
           arr[i] = arr[minIndex];
           arr[minIndex] = temp;
        }
    }
}
