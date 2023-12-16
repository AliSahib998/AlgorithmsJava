package hackerank.warmUp;

import java.util.List;

public class JumpingOnClouds {
  public static void main(String[] args) {

  }



  public static int jumpingOnClouds(List<Integer> c) {
    // Write your code here
    int res = 0;

    for (int i = 0; i < c.size(); i++) {
      if ((i+2) < c.size() && c.get(i+2) == 0) {
        res++;
        i += 1;
      } else if ((i+1) < c.size() && c.get(i+1) == 0) {
        res ++;
      }
    }

    return res;
  }


}
