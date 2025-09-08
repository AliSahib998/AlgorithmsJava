package hackerank.interview.warmup;

import java.util.List;

public class SalesByMatch {

  public static int sockMerchant(int n, List<Integer> ar) {
    int [] temp = new int[101];

    for (int i = 0; i < n; i++) {
      int element = ar.get(i);
      temp[element]++;
    }

    int result = 0;
    for (int i = 1; i < temp.length; i++) {
      result+=temp[i]/2;
    }


    return result;
  }

  public static void main(String[] args) {

  }


}
