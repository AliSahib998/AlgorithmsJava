package hackerank.warmUp;

public class RepeatedStrings {
  public static void main(String[] args) {

  }


  public static long repeatedString(String s, long n) {
    // Write your code here

    //s = ababa , n = 3  -> aba


    long res = 0;
    int size = n < s.length() ? (int) n : s.length();

    for (int i = 0; i < size; i++) {
      if (s.charAt(i) == 'a') {
        res++;
      }
    }

    if (n <= s.length()) {
      return res;
    }

    long r= n / s.length();
    long q = n % s.length();
    res = res * r;

    for (int i = 0; i < q; i++) {
      if (s.charAt(i) == 'a') {
        res++;
      }
    }

    return res;
  }


}
