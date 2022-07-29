package JavaStart.Array;

import static JavaStart.Array.Swap.swap;

public class Reverse {
    public static void main(String[] args) {
        int[]arr = {1,3,23,9};
        System.out.println(reverse(arr));
    }
    static int max(int[]arr){
        int maxvalue=arr[0];
        for (int j : arr) {
            if (j > maxvalue) {
                maxvalue = j;
            }

        }
        return maxvalue;
    }
    static int reverse(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start ++;
            end --;
        }

    }


}
