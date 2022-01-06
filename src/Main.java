import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//    =============================================JAVA Variables======================================================
    int x; //declaration
    x = 123; //
    int y = 123; //initialization
    long longNumber = 139743974384386438L;
    float number = 12.2f;
    double number2 = 3.45; //*
    boolean inLove = true;
    char symbol = '@';
    String name = "Charles"; // String is a reference data type.

    //JAVA SWAP TWO VARIABLES
    String a = "Water";
    String b = "Kool-Aid";
    String temp;
    temp = a;
    a = b;
    b = temp;
//        System.out.println("a: "+a);
//        System.out.println("b: "+b);
//        System.out.println(temp);
//    =============================================JAVA user input====================================================
//clear scanner by adding scanner.nextLine() after scanner.nextInt()
//    ============================================JAVA random numbers==================================================
    Random myRandom = new Random();
//    int randomNumber = myRandom.nextInt(6)+1;
    double yRandom = myRandom.nextDouble();
    boolean zRandom = myRandom.nextBoolean();
        System.out.println(zRandom);
//    =============================================JAVA IF/ELSE======================================================
    int age = 18;
    if(age>=18){
        System.out.println("You are an adult.");
    }else {
        System.out.println("You are not an adult.");
    }
//    =============================================JAVA while======================================================
    // execute a block of code as long as it's condition remains true
//    Scanner whileScanner = new Scanner(System.in);
//    String whileName = "";
//    do{
//        System.out.println("Enter you name: ");
//        whileName = whileScanner.nextLine();
//    }  while(whileName.isBlank());
//       System.out.println("Hello "+whileName);
//    =============================================JAVA for loop======================================================
//    =============================================JAVA nested for loops==================================================
//    Scanner nestedScanner = new Scanner(System.in);
//    int rows;
//    int columns;
//    String symbol2 = "";
//
//        System.out.println("Enter # of rows: ");
//        rows = nestedScanner.nextInt();
//        System.out.println("Enter # of columns: ");
//        columns = nestedScanner.nextInt();
//        System.out.println("Enter symbol to use: ");
//        symbol2 = nestedScanner.next();
//
//        for(int i=1; i<=rows; i++){
//            System.out.println();
//            for(int j=1; j<=columns; j++){
//                System.out.print(symbol2);
//            }
//        }
//    =============================================JAVA arrays and 2D arrays======================================================
    String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
    cars[0] = "Mustang";
        System.out.println(cars[3]);
//    =============================================JAVA wrapper classes==============================================
//    =============================================JAVA oop==========================================================
    ZCar myCar = new ZCar();
    
//    =============================================JAVA Variables======================================================
//    =============================================JAVA Variables======================================================
//    =============================================JAVA Variables======================================================
//    =============================================JAVA Variables======================================================

    }

}
