import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Say something to Bob.");
//        String userInput = scanner.nextLine();
//
//        if(userInput.endsWith("?")) {
//            System.out.println("Sure");
//        } else if(userInput.endsWith("!")){
//            System.out.println("Whoa, chill out!");
//        } else if(userInput.equals("")){
//            System.out.println("Fine. Be that way!");
//        } else{
//            System.out.println("Whatever");
//        }

        //Using Do While from Codeup Classroom
        Boolean confirmation = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi!");
        do {
            String response = sc.nextLine();
            if(response.endsWith("?")){
                System.out.println("Sure.");
            } else if(response.endsWith("!")){
                System.out.println("Whoah, chill out!");
            } else if(response.isEmpty()){
                System.out.println("Fine. Be that way!");
            } else if(response.contains("bye")){
                System.out.println("Bye");
                confirmation = false;
            } else {
                System.out.println("Whatever");
            }
        }while(confirmation);

    }
}
