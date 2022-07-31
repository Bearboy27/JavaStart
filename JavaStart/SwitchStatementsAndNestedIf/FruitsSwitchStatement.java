package JavaStart.SwitchStatementsAndNestedIf;
import java.util.Scanner;


public class FruitsSwitchStatement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a fruit name = ");
            String fruit = sc.next();
            switch (fruit) {
                case "mango" -> System.out.println("king of fruits");
                case "grape" -> System.out.println("smallest of fruits");
                case "apple" -> System.out.println("red fruits");
                case "pineapple" -> System.out.println("queen of fruits");
                default -> System.out.println("enter a valid fruit");
            }
        }
    }
    
}
