package JavaStart.JavaStart.Loops.Questions;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Random Three Number = ");

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max = a;
            if (b>max) {
                max = b;
            }
            if (c>max) {
                max = c;
            }
            System.out.print("Your greatest number = "+max);
        }
    }
    
}
