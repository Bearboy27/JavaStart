package JavaStart.Loops;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
          /*
     * syntax for Loops
     * for (initialization; condition;  increment/decrement){
     * body
     * }
     */
    

     // PRINT NUMBERS FORM 1 TO 5
     try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter a number so we will print up to that number from 1 (so kindly enter a number) = ");
         int num = sc.nextInt();
     for(int i = 1; i <= num; i++){
        System.out.print(" " + i);
    }
}
  
    }
}
