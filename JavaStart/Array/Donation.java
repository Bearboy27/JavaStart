package JavaStart.JavaStart.Array;

import java.util.Scanner;

public class Donation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int max=0;
        long ans=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            int diff = max-arr[i];
            ans = ans +diff+arr[i];
            System.out.print(diff+" ");

        }
        System.out.println();
        System.out.println(ans);
    }
}
