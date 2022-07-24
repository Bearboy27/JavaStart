package Loops.Questions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
                    int num1 = sc.nextInt();
            System.out.print("Enter Second Number: ");
                    int num2 = sc.nextInt();
            int ans = 0;
            while (true) {
                System.out.print("Select an operator: ");
                char op = sc.next().trim().charAt(0);
                if (op == '+' || op == '-' || op == '*' || op =='/' || op == '%') {
                    
                    if (op == '+') {
                        ans = num1+num2;
                    }
                    if (op == '-') {
                        ans = num1-num2;
                    }
                    if (op == '*') {
                        ans = num1*num2;
                    }
                    if (op == '/') {
                        ans = num1/num2;
                    }
                    if (op == '%') {
                        ans = num1%num2;
                    }
                    }else if(op == 'x' || op == 'X'){
                        break;
                    }else{
                        System.out.println("invalid Operator");
                    }
                    System.out.println("Your answer= "+ans);
                }
                
            }
        }
    }
    

