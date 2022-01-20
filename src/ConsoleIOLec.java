import java.util.Scanner;

public class ConsoleIOLec {
        public static void main(String[] args) {
//           String firstName = " Charles";
//           String lastName = "Aggasid";
//           System.out.printf("Hello, my name is %s,%s.", lastName, firstName);
//
//           Scanner scanner = new Scanner(System.in);
//
//           System.out.println(" What is you favorite color?");
//           String userInput = scanner.nextLine(); // Printing out a question, asking.
//           System.out.printf("Your favorite color is: %s.", userInput);

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter something: ");
            String userInput = scanner.next();

            System.out.println("You entered: --> \"" + userInput + "\" <--");



        }
}
