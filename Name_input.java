import java.util.Scanner;
public class Name_input {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first name: ");
            String Name = scanner.next();
            System.out.println("Enter the second name: ");
            String lastName = scanner.next();
            System.out.println("Enter the age: ");
            int age = scanner.nextInt();
            System.out.println("Name: " + Name + " " + lastName + " Age: " + age);
        }
        
    }
    
}
