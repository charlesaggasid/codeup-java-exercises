import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Random;


public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(Add(2,2));
//        System.out.println(Divide(2,5));
//      getInteger(1,10);
//      diceRoll();
      factorial();

    }
    //======================================== Question 1 ==============================================================
    /*
    1.Basic Arithmetic

    a. Create four separate methods. Each will perform an arithmetic operation:
    -Addition
    -Subtraction
    -Multiplication
    -Division
    b. Each function needs to take two parameters/arguments so that the operation can be performed.
    c. Test your methods and verify the output.
    d. Add a modulus method that finds the modulus of two numbers.
    Food for thought: What happens if we try to divide by zero? What should happen?
 */

    //Add
    public static int Add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    //Subs
    public static int Subs(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    //Multiply
    public static int Multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    //Divide
    public static int Divide(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    //Modulus
    public static int Modulus(int firstNum, int secondNum) {
        return firstNum % secondNum;
    }

    //============================================== Question 2 ========================================================
//    2. Create a method that validates that user input is in a certain range
//    The method signature should look like this:

//    public static int getInteger(int min, int max);

//    and is used like this:
//    System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);

//    If the input is invalid, prompt the user again.
//    HINT: recursion might be helpful.

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        }
        System.out.println("Number not in between 1-10.");
        return getInteger(min, max);
    }
    //============================================== Question 3 ========================================================
//    - Prompt the user to enter an integer from 1 to 10.
//    - Display the factorial of the number entered by the user.
//    - Ask if the user wants to continue.
//    - Use a for loop to calculate the factorial.
//    - Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    - Use the long type to store the factorial.
//    - Continue only if the user agrees to.
//    - A factorial is a number multiplied by each of the numbers before it.

//    - Factorials are denoted by the exclamation point (n!). Ex:
//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24

//        public static long factorial(int num){
//            long n = 1;
//            for (int i = 1; i <= n; i++){
//                n = n * i;
//            }
//            return n;
//        }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10");
        int num = scanner.nextInt();

        long factorial = 9;
        for(int i = 1; i <= num; ++i){
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
}




    //============================================== Question 4 ========================================================
//    4. Create an application that simulates dice rolling.

//    - Ask the user to enter the number of sides for a pair of dice.
//    - Prompt the user to roll the dice.
//    - "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//    - Use static methods to implement the method(s) that generate the random numbers.
//    - Use the .random method of the java.lang.Math class to generate random numbers.

    public static void diceRoll(){
        Scanner scanner = new Scanner(System.in);
        String yesOrNoString;
        System.out.println("Enter the number of sides for a pair of dice:");
        int userNumberInputOfSides = scanner.nextInt();
        System.out.println("Would you like to roll the dice?(y/n)");
        String userAnswer = scanner.next();
        if(userAnswer.equalsIgnoreCase("y")){
            do{
                int dice1 = (int) Math.floor(Math.random() * userNumberInputOfSides);
                int dice2 = (int) Math.floor(Math.random() * userNumberInputOfSides);
                System.out.println(dice1);
                System.out.println(dice2);

                System.out.println("Would you like to play again?(y/n)");
                yesOrNoString = scanner.next();
            }while (yesOrNoString.equalsIgnoreCase("y"));
        }


    }
}
