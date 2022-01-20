import util.Input;

public class ExeptionsErrorHandlingLec {
    public static void main(String[] args)  {
    //below is a generic exception
//    try {
//        getBestRocketsPlayer();
//    } catch (Exception e){
//        e.printStackTrace();
//        main(args);
//    }

//        try {
//            throw new Exception("No Billy!");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("I can still do some stuff after.");
//        }

//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e) {
//            System.err.println("Math still works!");
//        }

        //output
        // Let's see...
        //Math still works!

//        int[] numbers = {1, 2, 3};
//        int x;
//
//        try {
//            x = numbers[100];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Caught an array index exception!");
//        } catch (Exception e) {
//            System.out.println("Caught a generic exception!");
//        } finally {
//            System.out.println("This will always run.");
//        }
//    }
    //Method with a throw
//    public static String getBestRocketsPlayer() throws Exception {
//        Input in = new Input();
//        String answer = in.getString("Whos is the best Houston Rockets Player of All Time?");
//        if(!answer.equalsIgnoreCase("Moochie Norris")) {
//            throw new DavidMadException("How dare you ?");
//        }
//        return "Correct";
    }

}
