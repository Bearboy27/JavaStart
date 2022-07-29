package JavaStart.Conditional;
import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
    
        /*
        syntax for if else statement

        if (boolean expression T or F){
            " Body "
        }else{
            do this
        }
        
        */

    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the salary = ");
        int salary = sc.nextInt();

        if(salary>10000){
            salary = salary + 2000;        
        }else{
            salary = salary + 1000;
        }
        System.out.print("Your total salary = " + salary);
    }
    }

    
}
