import java.util.Scanner;

public class calculator {
    public static void main(String[] args ) {
       try (  Scanner s = new Scanner (System.in)) {
        double num1, num2 , result;
        char operator;
        System.out.println("Enter first number: ");
        num1 = s.nextDouble();
        System.out.println("Enter second number: ");
        num2 = s.nextDouble();
        System.out.println("Enter operator: ");
        operator = s.next().charAt(0);
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        

         } catch (Exception e) {
              System.out.println("Invalid input");
            }
    }
}

