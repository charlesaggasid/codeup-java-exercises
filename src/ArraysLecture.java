import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        String[] fruits = new String[4];
        fruits[0] = "orange";
        fruits[1] = "apples";
        fruits[2] = "plum";
        fruits[3] = "berry";


//        System.out.println(fruits[0]);

        //Iterating

        // JAVA
        for (String fruit : fruits) {
            System.out.println(fruit); //will show list of array
        }

        System.out.println(fruits);

        // The Array Class

        // Arrays.toString()
        System.out.println(Arrays.toString(fruits)); //output [orange, apples, plum, berry]


//        Array.fill() - void
        String[] stickers = new String[6];
        Arrays.fill(stickers, "yes");
        System.out.println(Arrays.toString(stickers));

    // Arrays.equals() = returns a boolean.
    String[] extraFruits = {"fruit1", "fruit2"};
        System.out.println(Arrays.equals(fruits,extraFruits));

//        Arrays.copyOf() = returns a copy of the array.
        String[] fruitClones = Arrays.copyOf(extraFruits, 10);
        System.out.println(Arrays.toString(fruitClones));



}
}
