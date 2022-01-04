import java.util.Locale;
import java.util.Scanner;

public class StringsLecture {
        public static void main(String[] args) {

                String message = "Hello";
                System.out.println(message); // prints "Hello"
                message = message + " World!";
                System.out.println(message); // prints "Hello, World!"

                String one = "2";
                String two = "2";
//                System.out.println(one.equals(two));

//             .equalsIgnoreCase(String anotherString)
                String greeting = "howdy";
//                System.out.println(greeting.equalsIgnoreCase("HoWDy"));

//              .startsWith(String prefix)
                String title = "Dr. Doctor";
                boolean isADoctor = title.toLowerCase().startsWith("dr");
//                System.out.println(isADoctor);

//              .endsWith(String suffix)
                String travisParkAddress = "311 E Travis St, San Antonio, TX 78205";
                String codeUpZip = "78205";
                boolean sameZipAsCodeup = travisParkAddress.endsWith(codeUpZip);
//                System.out.println(sameZipAsCodeup);

//              .charAt(int index)
//              consider that this method returns a char type and not a String type

                boolean firstLetterCapitalized = false;
                String word = "test";
                char firstLetter = word.charAt(0);
                if (firstLetter == Character.toUpperCase(firstLetter)) {
                    firstLetterCapitalized = true;
                }
//                System.out.println(firstLetterCapitalized);

    /*          char d = 'd';
                System.out.println(d == 'd');

                Scanner scanner = new Scanner(System.in);
                String favoriteSoda = "Pepsi Wild Cherry";
                System.out.println("Hey David, what is your favorite soda?");
                String userSoda = scanner.nextLine();
                System.out.printf("David remembered his favorite soda, and typed it's name properly! %b", favoriteSoda.equals(userSoda));
                System.out.printf("David remembered his fave soda: %b", favoriteSoda.equalsIgnoreCase(userSoda));
                */

//              Compare the start and end of a string

              String david = "David";
                String dad = "Dad";
                char firstLetterOfDavid = david.charAt(0);
                System.out.println("Does \"David\" and \"Dad\" start with the same letter? " + dad.startsWith("" + firstLetterOfDavid));
                char lastLetterOfDavid = david.charAt(david.length() - 1);
                System.out.println(lastLetterOfDavid);

                // Changing casing in strings
                String scream = "AHHHHHHH!!!!";
                System.out.println(scream.toLowerCase(Locale.ROOT));

               // String Manipulation
               String barney = "Barney the Dinosour";
               System.out.printf("Location of the \"The\" in string at index %d.%n", barney.indexOf("The"));

               String dinosaur = barney.substring(11);
               System.out.println(dinosaur);
               String the = barney.substring(7,10);
               System.out.println(the);

               //get from github

               //Trimming String
               String fluffyString = "           I love chocolate     ";
            System.out.println(fluffyString.trim());
            System.out.println(fluffyString);

               //lasIndexOf
               String band = "Queen";
//            System.out.println(band.las);





        }
}
