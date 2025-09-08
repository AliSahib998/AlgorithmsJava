package hackerank.interview.arrays;

import java.util.List;

public class HourGlassesSum {

  public static int hourglassSum(List<List<Integer>> arr) {
    int sum = Integer.MIN_VALUE;
    for (int i = 0; i < 4; i++) {
      List<Integer> list1 = arr.get(i);
      List<Integer> list2 = arr.get(i+1);
      List<Integer> list3 = arr.get(i+2);
      for (int j = 0; j < 4; j++) {
        int temp = list1.get(j) + list1.get(j+1)+list1.get(j+2) +
            list2.get(j+1) + list3.get(j) + list3.get(j+1)+list3.get(j+2);
        if (sum < temp) {
          sum = temp;
        }
      }
    }
    return sum;
  }

}
