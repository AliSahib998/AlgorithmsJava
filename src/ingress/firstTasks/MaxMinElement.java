package ingress.firstTasks;


import java.util.Collections;
import java.util.PriorityQueue;

public class MaxMinElement {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //System.out.println(maxElement(arr));//O(N), O(1)
        //System.out.println(minElement(arr));//O(N), O(1)
        System.out.println(nthMaxElement(arr, 3));
    }

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }


    public static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int nthMaxElement(int[] arr, int d) {
        if (d >= arr.length)  {
            return -1;
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int j : arr) {
            priorityQueue.add(j);
        }

        int temp = 0;
        Integer nMax = 0;
        while(temp < d) {
          nMax = priorityQueue.poll();
          temp++;
        }

        return nMax;
    }


}
