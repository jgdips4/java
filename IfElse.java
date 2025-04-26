import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is not positive.");
            } else {
                System.out.println("The number is 0.");}
        }
        }
    }
