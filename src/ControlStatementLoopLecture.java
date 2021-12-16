import java.util.Scanner;

public class ControlStatementLoopLecture {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean hasPizzaRolls = true;
        boolean hasPepsiWildCherry = false;

//        System.out.printf("Is David prepared for a night without Julienne: %b%n", hasPizzaRolls && hasPepsiWildCherry);
//        System.out.printf("Does David have something to guide him through the darktimes: %b%n", hasPizzaRolls || hasPepsiWildCherry);
//        System.out.printf("Will David go hungry: %b%n", !hasPizzaRolls);
//        System.out.printf("Will David go thirsty: %b%n", !hasPepsiWildCherry);

        //Comparison
//        System.out.println("Did you bring gum? How many gum do you have?");
//        int sticksOfGum = sc.nextInt();
//        System.out.printf("Enough gum: %b%n", sticksOfGum >= 23); //Enough for everyone in class.

        System.out.println("How much wood could a woodchuck chuck?");
        int chuckableWood = sc. nextInt();
        System.out.printf("Got 'em: %b%n", chuckableWood > 0);

//        System.out.println("How many seasons of Lizzie?");
//        int lizzieSeasons = sc.nextInt();
//        System.out.printf("Knows who Hilary Duff is: %b%n", lizzieSeasons == 2); // only works with primitive data types

//        System.out.println("Who was the 1994 and 1995 NBA Finals MVP?");
//        String number34 = sc.nextLine();
//        System.out.format("User from Houston && Likes Basketball: %b%n", number34.equalsIgnoreCase("Hakeem Olajuwon")); // .equalIgnoreCase = ignores .equals = exact

          // ------ IF/ELSE

//          if (chuckableWood > 0) {
//              System.err.println("IF a woodchuck COULD chuck wood.");
//          }

          // ------ SWITCH

//          switch (sticksOfGum) {
//              case 23:
//                  System.out.println("Just enough gum for everyone!");
//                  break;
//              case 22:
//                  System.out.println("How selfless of you.");
//                  break;
//              case 24:
//                  System.out.println("Oh so you get two pieces?");
//                  break;
//              default:
//                  System.out.println("NO GUM in CLASS!");
//                  break;
//          }

           // ------- WHILE
//              while (!number34.equalsIgnoreCase("Hakeem Olajuwon")) {
//                  System.out.println("You wanna try that again?");
//                  number34 = sc.nextLine();
//              }

              do {
                  System.out.println("How much could a woodchuck");
                  chuckableWood = sc.nextInt();
              } while (chuckableWood > 0);

              for (int i = 1; i <= 20; i++) {
                  System.out.println(i);
              }

    }

}
