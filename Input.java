
import java.util.*;
public class Input {
  
    public static void main(String[]args)

    {   try (Scanner sc = new Scanner(System.in)){
        System.out.print("Enter first no : " );
        int a = sc.nextInt();
        System.out.print("Enter second no : ");
        int b = sc.nextInt();
        System.out.print("Sum :");
        int sum = a + b;
        System.out.println(sum);
    }
}
}
