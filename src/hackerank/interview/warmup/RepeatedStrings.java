package hackerank.interview.warmup;

public class RepeatedStrings {

  public static long repeatedString(String s, long n) {
    long count = 0;
    if (n <= s.length()) {
      for(int i = 0; i < n; i++) {
        if (s.charAt(i) == 'a') {
          count++;
        }
      }
      return count;
    }


    for(char c : s.toCharArray()) {
      if (c == 'a') {
        count++;
      }
    }

    count = count * (n / s.length());
    long mod = n % s.length();
    for (int i = 0; i < mod; i++) {
      if (s.charAt(i) == 'a') {
        count++;
      }
    }

    return count;
  }


}
