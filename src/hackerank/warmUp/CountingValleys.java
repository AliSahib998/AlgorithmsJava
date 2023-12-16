package hackerank.warmUp;

public class CountingValleys {
  public static void main(String[] args) {

  }

  public static int countingValleys(int steps, String path) {
    // Write your code here
    int seaLevel = 0;
    int valley = 0;

    for (int i = 0; i < steps; i++) {
      if (path.charAt(i) == 'U') {
        seaLevel ++;
        if(seaLevel == 0) {
          valley++;
        }
      } else {
        seaLevel --;
      }


    }

    return valley;


  }


}
