package JavaStart.JavaStart.Loops.Questions;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your number= ");
            int a = sc.nextInt();
            System.out.print("Enter the number you wanted to search in entered number= ");
            int b = sc.nextInt();
            int count =0;
            while (a>0) {
                int rem = a%10;
                if (rem==b) {
                    count++;
                }
                a=a/10;
            }
            System.out.print("The elements are = "+count);
        }
    }
    
}
