package JavaStart.Loops;

import java.util.Scanner;

public class WhileLoop {
   public static void main(String[] args) {
     try (/*while Loop
         * while(condition){
         * body
         * }
         */
    Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter how many numbers do you want to print from 1 (kindly enter the number)= ");
        int num = sc.nextInt();
         int i = 1;
         while(i <= num){
            System.out.print(" "+i);
            i++;
         }
    }
   }
    
}
