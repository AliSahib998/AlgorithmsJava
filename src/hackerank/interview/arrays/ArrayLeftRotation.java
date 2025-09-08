package hackerank.interview.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class ArrayLeftRotation {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //List<Integer> res = rotLeft1(list, 2);
        //List<Integer> res = rotLeft2(list, 2);
        List<Integer> res = rotLeft3(list, 2);
        System.out.println(res);
    }


    /**
     * Method 1 for left shift n time
     */
    public static List<Integer> rotLeft1(List<Integer> a, int d) {
       int n = a.size();
       d = d %n;
       // 1,2,3,4,5 d = 2
        // 3,4,5,1,2
        /*
           0-2
           1-3
           2-4
           3-0
           4-1
         */
       List<Integer> list = new ArrayList<>();
       for (int i = 0; i < a.size(); i++) {
           list.add(a.get((d + i) % a.size()));
       }
       return list;
    }

    /**
     * Method 2 for left shift n time
     */
    public static List<Integer> rotLeft2(List<Integer> a, int d) {
        int n = a.size();
        d = d % n;
        for (int i = 0; i < d; i++) {
            left(a);
        }
        return a;
    }

    /**
     * Method 3 for left shift n time
     */
    public static List<Integer> rotLeft3(List<Integer> a, int d) {
        int n = a.size();
        d = d % n;
        reverse(a, 0, n - 1);
        reverse(a, 0, n - d - 1);
        reverse(a, n - d, n - 1);
        // 1,2,3,4,5 d = 2
        //5 4 3 2 1
        // 3,4,5,1,2
        return a;
    }

    public static void reverse(List<Integer> list, int l, int r) {
        while(l < r) {
            Collections.swap(list, l, r);
            l++;
            r--;
        }
    }

    public static void left(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int first = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            list.set(i - 1, list.get(i));
        }
        list.set(list.size() - 1, first);
    }

}
