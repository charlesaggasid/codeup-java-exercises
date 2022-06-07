public class HelloWorld {
    public static void main(String[] args) {
        int myFavoriteNumber;
        myFavoriteNumber = 8;
        System.out.println(myFavoriteNumber);

        String myString;
        myString = "string";
        System.out.println(myString);
//      myString = 3.12; provided double

        float myNumber;
        myNumber = 123;

        double pi = 3.14;

//        3.14 is a double , 123L l will not be printed ,
//        java: variable myNumber might not have been initialized

/*What is the difference between the above code blocks? Explain why the code outputs what it does.*/
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        5, 6
        int x = 5;
        System.out.println(++x); //6
        System.out.println(x); //6

//        Try to create a variable named class. What happens? it's a reserved word.

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

// 11 try to create a variable class. what happens? java is not a state,emt
//String class = "yes"

// 12 Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

        System.out.println();


    }
}
