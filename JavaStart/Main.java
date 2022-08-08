package JavaStart.JavaStart;

import java.util.Arrays;

public class Main{
    // Binary Search on sorted 2D array


        static int[] findAns(int[][] arr)
        {
            int row = 0;
            int col = arr[row].length - 1;
            while (row < arr.length && col >= 0) {
                if (arr[row][col] == 29) {
                    return new int[] { row, col };
                }

                // Target lies in further row
                if (arr[row][col] < 29) {
                    row++;
                }
                // Target lies in previous column
                else {
                    col--;
                }
            }
            return new int[] { -1, -1 };
        }

        // Driver Code
        public static void main(String[] args)
        {

            // Binary search in sorted matrix
            int[][] arr = { { 10, 20, 30, 40 },
                    { 15, 25, 35, 45 },
                    { 27, 29, 37, 48 },
                    { 32, 33, 39, 50}};
            int[] ans = findAns(arr);
            System.out.println("Element found at index: "
                    + Arrays.toString(ans));
        }
    }



