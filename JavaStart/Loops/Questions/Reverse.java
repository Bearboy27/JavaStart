package JavaStart.JavaStart.Loops.Questions;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number= ");
            int num = sc.nextInt();
            int ans =0;
            while (num>0) {
                int rem = num%10;
                num/=10;
                ans = ans*10+rem;
            }
            System.out.print("Your reversed number= "+ans);
        }
    }
    
}
