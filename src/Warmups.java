import java.util.Scanner;

public class Warmups {
    public static void main(String[] args) {
//       String message = "Java is statically typed, while Javascript is dynamically typed.";
//        System.out.println(message);

        Scanner scanner = new Scanner(System.in);

        System.out.println(" What did you eat for breakfast?");
        String userBreakfast = scanner.nextLine(); // Printing out a question, asking.
        System.out.printf("Your breakfast today is %s.", userBreakfast);


    }
}
