import java.util.Scanner;  
public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        sc.close();
    }
}
 
 //Output: 
 //Enter a number: 
 //5
//The number is odd
