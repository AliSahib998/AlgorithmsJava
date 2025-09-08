package hackerank.interview.warmup;

import java.util.List;

public class JumpingCloud {

  public static int jumpingOnClouds(List<Integer> c) {
    int result = 0;
    for(int i = 0; i < c.size()-1; i++) {
      if ((i+2) < c.size() && c.get(i+2) == 0) {
        i = i+1;
      }
      result++;
    }

    return result;
  }


}
