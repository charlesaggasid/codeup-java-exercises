import java.util.Scanner;

public class JavaTextRPGGame {
    Scanner myScanner = new Scanner(System.in);
    int userSelectedOption;
    int health;
    String playerName;
    String weapon;

    public static void main(String[] args) {
    JavaTextRPGGame javaGame;
    javaGame = new JavaTextRPGGame();
    javaGame.playerSetUp();
    javaGame.mainArena();
// ---------------------------------------------
    }

    public void playerSetUp(){
        health = 10;
        weapon = "Baseball bat";

//        System.out.println("Enter your name:");
//        playerName = myScanner.nextLine();
        System.out.println("********* Game Start **********");
        System.out.println("Hello let's start your adventure.");
        System.out.println("********************************");
    }

    public void mainArena(){
        System.out.println("");
        System.out.println("You're at the main arena.\nYou can choose where to go from here.");
        System.out.println("______________________________________");
        System.out.println("1: Go to battle.");
        System.out.println("2: Get some health potion.");
        System.out.println("3: Leave");

        userSelectedOption = myScanner.nextInt();
        if(userSelectedOption==1){
            health = health - 5;
            System.out.println("(You got attacked and received 5 damages)1\nYour HP: " + health);
            System.out.println("Do you wanna keep fighting?");
            System.out.println();
        }
        if(userSelectedOption==2){
            System.out.println("Here's some health potion for you.");
        }
        if(userSelectedOption==3){
            System.out.println("Bye!");
        }


    }



}
