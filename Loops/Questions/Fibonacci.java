package Loops.Questions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter The Fibonacci Number= ");
            int n = sc.nextInt();
            int a = 0;
            int b = 1;
            int count = 2;
            while (count<=n) {
                int temp = b;
                b = b+a;
                a = temp;
                count++;
            }
    System.out.print("Your Fibonacci Number= "+b);
        }
    }
    
}
