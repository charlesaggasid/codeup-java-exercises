public class AnnotationsLecture {

   //1.
   @Deprecated
   public static String welcome(String name) {
    return "Welcome from " + name;
   }
   //2.
   public static String greeting(String name){
    return String.format("Greetings from %s.", name);
   }

   //3
   @SuppressWarnings("all")

   //MAIN METHOD
    public static void main(String[] args) {
        System.out.println(welcome("Charles"));
    }

}

/**
 1. Deprecated
 //The @Deprecated annotation is used to indicate
 that a class, method, or field should no longer be used.


 */
