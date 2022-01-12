package util;
import java.util.Scanner;

public class Input {
//    private static Scanner scanner;
//=>Constructor
//    public Input(){
//        this.scanner = new Scanner(System.in);
//    }


private Scanner scanner = new Scanner(System.in);
//===========================================================
    public String getString(){
        String userResponse = scanner.nextLine();
        return userResponse;
    }

    public String getString(String prompt){
        System.out.println(prompt);
        String userResponse = scanner.nextLine();
        System.out.printf("\nYou entered: %s\n", userResponse);
        return userResponse;
    }

//    public boolean yesNo(){
////        System.out.println("Would you like to continue?");
//        String userResponse = scanner.next();
//        if(userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")){
//            return true;
//        }else {
//            return false;
//        }
//    }

    public boolean yesNo(){
        String userAnswer = scanner.next();
        scanner.nextLine();
        return userAnswer.equals("y");
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String userResponse = scanner.nextLine();
        if(userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")){
            return true;
        }else {
            return false;
        }
    }

    public int getInt(int min, int max){
        System.out.printf("Please enter a number between %d and %d. \n", min, max);
        int userNum = scanner.nextInt();
        if(userNum > max || userNum < min){
            return getInt(min, max);
        }
        return userNum;
    }
    public int getInt(){
        System.out.println("Enter a whole number: ");
        int userNum = scanner.nextInt();
        System.out.printf("You chose %d: ",userNum);
        return userNum;
    }

    public double getDouble(double min, double max){
        System.out.printf("Please enter a number between %f and %f. \n", min, max);
        double userNum = scanner.nextDouble();
        if(userNum > max || userNum < min){
            return getDouble(min, max);
        }
        return userNum;
    }

    public double getDouble(){
        System.out.println("Enter a whole number: ");
        double userNum = scanner.nextDouble();
        System.out.printf("You chose %f: ",userNum);
        return userNum;
    }








//==
//    public String getString(){
//        System.out.println("Enter a string: ");
//        return this.scanner.nextLine();
//    }
//
//    public String getString(String prompt) {
//        System.out.println(prompt);
//        return this.scanner.nextLine();
//    }
//===========================================================
//The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//    public boolean yesNo(){
//        String userInput = this.scanner.next();
//        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
//    }
//
//    public boolean yesNo(String prompt){
//        System.out.println(prompt);
//        return yesNo();
//    }
//===========================================================
//    public int getInt(){
//        System.out.println("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        return userInput;
//    }
// another getInt()
//    public int getInt(int min, int max){
//        int userIntInput;
//        System.out.println("Enter a number: ");
//        userIntInput = this.scanner.nextInt();
//        if(userIntInput > max || userIntInput < min){
//            return getInt(min, max);
//        }else{
//            return userIntInput;
//        }
//    }
//===========================================================
//    public double getDouble(){
//        System.out.println("Enter a 'double' number:");
//        double userInput = scanner.nextDouble();
//        return userInput;
//    }
//prompt
//    public double getDouble(String prompt){
//        System.out.println(prompt);
//        double userInput = scanner.nextDouble();
//        return userInput;
//    }
//
//    public double getDouble(double min, double max) {
//        double userDouble;
//        System.out.printf("Please enter a decimal number between %f and %f: %n", min, max);
//        userDouble = this.scanner.nextDouble();
//        if(userDouble > max || userDouble < min){
//            return getDouble(min,max);
//        } else {
//            return userDouble;
//        }
//
//    }

//===========================================================
//===========================================================
//===========================================================
//===========================================================
//===========================================================
//===========================================================
//===========================================================
//===========================================================



}
