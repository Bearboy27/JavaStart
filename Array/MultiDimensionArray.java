package JavaStart.Array;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] arr= new int[3][2];
        arr[0][0] = 1;
        arr[0][1] = 2;

        arr[1][0] = 3;
        arr[1][1] = 4;

        arr[2][0] = 5;
        arr[2][1] = 6;
        for (int[] singleRow : arr) {
            for (int i : singleRow) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
