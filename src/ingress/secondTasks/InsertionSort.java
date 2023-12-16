package ingress.secondTasks;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6,8,2,9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int index = i;
            int key = arr[i];
            for (int j = i-1; j >= 0 && key < arr[j] ; j--) {
                arr[j+1] = arr[j];
                index = j;
            }
            arr[index] = key;
        }
    }
}
