package hackerank.warmUp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMerchant {
  public static void main(String[] args) {

  }

  public static int sockMerchant(int n, List<Integer> ar) {
     int size = 101;
     int pair = 0;
     Map<Integer, Integer> map = new HashMap<>();
     for (int i = 0; i < n; i++) {
       map.put(ar.get(i), map.getOrDefault(ar.get(i), 0) + 1);
     }

     for (Integer i : map.keySet()) {
       pair += map.get(i) / 2;
     }

     return pair;

  }



  public static int sockMerchantV2(int n, List<Integer> ar) {
    int [] map = new int[101];
    int pair = 0;
    for (int i = 0; i < n; i++) {
      map[ar.get(i)] = map[ar.get(i)] + 1;
    }

    for (Integer i : map) {
      pair += i / 2;
    }

    return pair;

  }
}
