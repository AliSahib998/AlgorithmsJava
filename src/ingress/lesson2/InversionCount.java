package ingress.lesson2;

public class InversionCount {

    public static void main(String[] args) {
        // example array [5,3,1] -here [5,3], [5,1] and [3,1] is inversion because they are not correct order.
        int[] nums = {6,3,1,5};// [6,3], [6,1], [3,1], [6,5]
        System.out.println(findInversionCount1(nums));
    }

    public static int findInversionCount1(int[] nums) {
        // bubble sort
        // time complexity -> O(N^2)
        // space complexity -> O(1)
        int inversionCount = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    inversionCount ++;
                }
            }
        }
        return inversionCount;
    }

    public static int findInversionCount2(int[] nums) {

         return 0;
    }

}
