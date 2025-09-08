package hackerank.interview.warmup;

public class CountingValley {

  public static int countingValleys(int steps, String path) {
    int valleyCount = 0;
    int seaLevel = 0;

    for(char c : path.toCharArray()) {
       if (c == 'U') {
         seaLevel++;
       } else {
         seaLevel--;
       }
       if (c == 'U' && seaLevel == 0) {
         valleyCount ++;
       }
    }

    return valleyCount;

  }


}
