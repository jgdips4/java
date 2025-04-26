import java.util.*;
public class Aisgreaterthanb {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Value os a : ");
            int a = sc.nextInt();
            System.out.print("Enter the valu of b :");
            int b = sc.nextInt();
            if (a > b) {
                System.out.println("a is greater than b");
            } else if (a < b) {
                System.out.println("a is smaller than b");
            } else {
                System.out.println("a is equal to b");
            }
        }
    }
}
    

