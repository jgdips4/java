import java.util.*;
public class tableusingforloop {
    public static void main(String[] args) {
        System.out.print("Enter Table you want : ");
            try(Scanner sc = new Scanner(System.in)){
             int n = sc.nextInt();
            for (int i=1;i<=10;i++){
            System.out.println(n+ "*" +i+ "="+ n*i);
            }
        }        
    }    

}