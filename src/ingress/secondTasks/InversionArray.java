package ingress.secondTasks;

import java.util.Arrays;

public class InversionArray {
    public static void main(String[] args) {
        int[] arr = {3,2,6,5,4};
        //3,2
        //6,5
        //6,4
        //5,4
        System.out.println(inversionCountWorstWay(arr));
    }

    public static int inversionCountWorstWay(int[] arr) {
        int inversionCount = 0;
        for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
               if (arr[i] > arr[j]) {
                   inversionCount++;
               }
           }
        }
        return inversionCount;
    }

    public static int inversionCountBestWay(int[] arr) {
        int inversionCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    inversionCount++;
                }
            }
        }
        return inversionCount;
    }
}
