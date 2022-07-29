package JavaStart.Array;

public class Max {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        System.out.println(max(arr));
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
}
