package Loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        try (/*
                 * syntax of Do while loop
                 * do{
                 * }while (condition);
                 */
        Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number so we will print upto that number from 1 (so kindely enter a number) = ");
           int num = sc.nextInt();
            int i=1;
            do{
                System.out.print(" "+i);
                i++;
            }while(i<=num);
        }
    }
    
}
