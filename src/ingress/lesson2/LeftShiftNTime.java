package ingress.lesson2;

public class LeftShiftNTime {

    public static void main(String[] args) {

    }

    public int[] leftNShift(int[] arr, int d) {
        //1,2,3,4,5
        //2,3,4,5,1
        // d= 2
        //3,4,5,1,2
        //4,5,1,2,3
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[(i + d) % arr.length];
        }
        return res;
    }

    public void leftNShift2(int[] arr, int d) {
        //1,2,3,4,5
        // d = 1
        // 2,3,4,5,1

        // 1,2,3,4,5
        // d = 2
        // 3,4,5,1,2




    }

    public static void reverse(int[] arr, int left, int right) {
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }


}
