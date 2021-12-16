import java.util.Scanner;

    public class ConsoleExercises {
        public static void main(String[] args) {
//Explore the Scanner Class.

//            double pi = 3.14159;
//            System.out.format("The value of pi is approximately %f.", pi );


//Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//What happens if you input something that is not an integer? exception in thread.

//             Scanner scan = new Scanner(System.in);
//             System.out.println("Enter an int:");
//             int userInput = scan.nextInt();
//             System.out.printf("This is the int your entered: %d", userInput);

//Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//What happens if you enter less than 3 words?  Using next, it will
//What happens if you enter more than 3 words? nothing

//             Scanner myObj = new Scanner(System.in);
//             System.out.println("Enter three words:");
//
//             String firstWord = myObj.next();
//             String secondWord = myObj.next();
//             String thirdWord = myObj.next();
//
//             System.out.printf("First word is: %s%n", firstWord);
//             System.out.printf("Second word is: %s%n", secondWord);
//             System.out.printf("Third word is: %s", thirdWord);


//Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//do you capture all the words? no
//Rewrite the above example using the nextLine method.
//              Scanner mySentenceObj = new Scanner(System.in);
//              System.out.println("Write me a simple sentence.");
//
//              String sentence = mySentenceObj.nextLine();
//
//              System.out.printf("The sentence you wrote is: %s %n", sentence);

/**Calculate the perimeter and area of Codeup's classrooms.**/

//         1. Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//
//            Use the nextLine method each time you need to get user input. In this case, we need it twice, once to
//            get the user input for the length and again to get the user input for the width. PARSE the resulting
//            strings to a numeric type.
//          * Assume that the rooms are perfect rectangles.
//          * Assume that the user will enter valid numeric data for length and width.

//         2. Display the area and perimeter of that classroom.
//
//            The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle
//            is equal to 2 times the length plus 2 times the width.

//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter length of rectangle: ");
//            String length = scanner.nextLine();

float length, width, perimeter, area;
Scanner scanAreaPerimeter = new Scanner(System.in);

//Input
            System.out.println("Enter length of rectangle: ");
            length = scanAreaPerimeter.nextFloat();
            System.out.println("Enter width of rectangle: ");
            width = scanAreaPerimeter.nextFloat();
            //Calculate area and perimeter of rectangle.
            perimeter = 2 * (length + width);
            area = length * width;
            System.out.println("Perimeter of rectangle is " + perimeter + ".");
            System.out.println("Area of rectangle is " + area + ".");

        }
    }


