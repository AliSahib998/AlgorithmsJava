package hackerank.arrays;

import java.util.List;

public class HourglassSum {

  public static void main(String[] args) {

  }

  public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here

    int sum = Integer.MIN_VALUE;
    for (int i = 0; i < 4; i++) {
      List<Integer> list1 = arr.get(i);
      List<Integer> list2 = arr.get(i+1);
      List<Integer> list3 = arr.get(i+2);
      int temp = 0;
      for (int j = 0; j < 4; j++) {
        temp += list1.get(j) + list1.get(j+1) + list1.get(j+2) + list2.get(j+1)+
            list3.get(j) + list3.get(j+1) + list3.get(j+2);
        if (temp > sum) {
          sum = temp;
        }

        temp = 0;
      }
    }


    return sum;

  }


}
