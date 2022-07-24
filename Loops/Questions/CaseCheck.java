package Loops.Questions;

import java.util.Scanner;

public class CaseCheck {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter your words = ");
        char ch = sc.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
          System.out.print("Lower Case");
        }else{
          System.out.print("Upper Case");
        }
    }
    
   }
}
