import java.util.Scanner;
public class SwitchExample {
    public static void main(String[] agrs) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter day of the week (or type 'exit' to quit): ");
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                int day;
                try {
                    day = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 7 or 'exit' to quit.");
                    continue;
                }
                switch (day) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("Invalid day");
                        break;
                }
            }
        }
    }
}