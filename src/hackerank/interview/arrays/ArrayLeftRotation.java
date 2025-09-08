package hackerank.interview.arrays;

import java.util.ArrayList;
import java.util.List;

// https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class ArrayLeftRotation {


    public static void main(String[] args) {

    }


    public static List<Integer> rotLeft1(List<Integer> a, int d) {
       int n = a.size();
       d = d %n;
       // 1,2,3,4,5 d = 2
        // 3,4,5,1,2
       List<Integer> list = new ArrayList<>();
       for (int i = 0; i < a.size(); i++) {
           int element = a.get(i);
           int index = (d + i) % a.size();
           a.add(element);
       }
       return list;
    }

}
