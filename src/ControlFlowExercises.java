import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

//     1. LOOP BASICS
//     a. While
//        Create an integer variable i with a value of 5.

//        Create a while loop that runs so long as i is less than or equal to 15.

//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//        5 6 7 8 9 10 11 12 13 14 15

//        for(int i = 5; i <= 15; i++){
//            System.out.print(i + " ");
//        }
//
//          int i = 5;
//          while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//       b. Do While
//        * Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        for(int i = 0; i <= 100; i+=2) {
//          System.out.println(i);
//        }

//        int i = 0;
//        do{
//          System.out.println(i+=2);
//        } while (i < 100);

//         * Alter your loop to count backwards by 5's from 100 to -10.
//        for(int i = 100; i >= -10; i-= 5) {
//            System.out.println(i);
//        }

//            int i = 100;
//            do {
//                System.out.println(i-=5);
//            }while(i > -10);

//         * Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//        for(double i = 2; i < 1000000; i = Math.pow(i,2)) {
//            System.out.println( (int) i);
//        }

//            double i = 2;
//            do {
//                System.out.println((int)i);
//                i = Math.pow(i, 2);
//            } while (i <= 1000000);

//        2. Fizzbuzz

//         * Write a program that prints the numbers from 1 to 100.
//         * For multiples of three: print “Fizz” instead of the number.
//         * For the multiples of five: print “Buzz”.
//         * For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for(int i=1; i < 101; i++) {
//            System.out.println(i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : i);
//        }

//for (int i = 1; i < 101; i++){
//    if(i % 5 == 0 && i % 3 == 0) {
//        System.out.println("FizzBuzz");
//    } else if(i % 3 == 0) {
//        System.out.println("Fizz");
//    } else if(i % 5 == 0) {
//        System.out.println("Buzz");
//    } else {
//        System.out.println(i);
//    }
//        }

//        3. Display a table of powers.

//        Display a table of squares and cubes from 1 to the value entered.
//        Only continue if the user agrees to.
//        Scanner scanner = new Scanner(System.in);
//        boolean askUserToContinue = true;
//
//        do {
//            System.out.println("What number would you like to go up to?:");
//            int userNum = scanner.nextInt();
//            System.out.println(); //space
//            System.out.println("Here is your table!");
//            System.out.println(); //space
//            System.out.println("number | squared | cubed\n------ | ------- | -----\n");
//            System.out.println("");
//
//            for(int i = 1; i <= userNum; i++){
//                System.out.printf("%-6d | %-7d | %d\n", i, i * i, i * i * i); //Print Table
//            }
//            System.out.println("Do you want to continue?");
//            String storeUserResponse = scanner.nextLine();
//            if(!storeUserResponse.equalsIgnoreCase("yes")) {
//                askUserToContinue = false;
//            }
//        } while (askUserToContinue);



//        4. Convert given number grades into letter grades.
//
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//           System.out.println("Please enter grade from 0-100");
//           int userInput = scanner.nextInt();
//           int A = 100; // a+
//           int B = 87;
//           int C = 79;
//           int D = 66;
//           int F = 59;
//
//           String userAnswer;
//         do{
//            if (userInput >= A){
//                System.out.println("You got " + userInput + " score." + "That's an A+!");
//            } else if(userInput >= B){
//                System.out.println("You got " + userInput + " score." + "That's a B!");
//            } else if(userInput >= C) {
//                System.out.println("You got " + userInput + " score." + "That's a C!");
//            } else if (userInput >= D){
//                System.out.println("You got " + userInput + " score." + "That's a D!");
//            }else if (userInput >= F){
//                System.out.println("You got " + userInput + " score." + "That's an F!");
//            }
//             System.out.println("Would you like to continue?");
//             userAnswer = scanner.next();
//         } while (userAnswer.equalsIgnoreCase("yes"));

//        Bonus
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
    }
}
