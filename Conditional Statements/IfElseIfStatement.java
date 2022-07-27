import java.util.Scanner;

public class IfElseIfStatement {
    public static void main(String[] args) {
        /*
         * Syntax of multiple if else if Statement
         * 
         * if (boolean expression Yor F){
         * body
         * }else if {
         * do this
         *}else {
            do this
         }

         */
    
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter your salary = ");
        int salary = sc.nextInt();

        if (salary>10000) {
            salary += 2000;
        }else if (salary>20000) {
            salary+=3000;
        }else {
            salary+=1000;
        }
        System.out.print("Your salary = " +salary);
    }
      
    }

    
}
