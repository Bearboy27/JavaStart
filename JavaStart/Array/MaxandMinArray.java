package JavaStart.JavaStart.Array;

import java.util.Scanner;

public class MaxandMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values = ");
        int testcase = sc.nextInt();
        for (int tc = 0; tc < testcase ; tc++) {

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int min = arr[0];
            int max = arr[0];

            for (int i = 1; i < n; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            System.out.println(max + " " + min);
//        testcase--;
        }
    }
}
//2
//5
//7 3 4 5 6
//4
//1 2 3 4
