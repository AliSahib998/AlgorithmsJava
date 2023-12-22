package hackerank.arrays;

import java.util.ArrayList;
import java.util.List;

public class RotateLeft {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    //1,2,3,4,5
    //5 1 2 3 4

    System.out.println(rotLeft(list, 4));
  }

  public static List<Integer> rotLeft(List<Integer> a, int d) {
    // Write your code here
    int m = a.size() - d % a.size();

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < a.size(); i++) {
      list.add(-1);
    }

    for (int i = 0; i < a.size(); i++) {
      list.set((i+m) % a.size(), a.get(i));
    }

    return list;
  }


}
