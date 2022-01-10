import java.util.Arrays;

public class ArraysExercises {
//3. Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

    public ArraysExercises() {
    }

    public static Person[] addPerson(Person[] myPerson, Person newPerson){
        Person[] outputArr = Arrays.copyOf(myPerson, myPerson.length + 1);
        outputArr[outputArr.length - 1] = newPerson;
        return outputArr;
    }

    public static void main(String[] args) {
//1. What happens when you run the following code? Why is Arrays.toString necessary?
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//2. Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        Person[] myPerson = new Person[3];
        myPerson[0] = new Person("Charles");
        myPerson[1] = new Person("Stephen");
        myPerson[2] = new Person("David");

        for (int i = 0; i < myPerson.length; i++) {
            System.out.println(myPerson[i].getName());
        }

        myPerson = addPerson(myPerson, new Person("Noah"));
        System.out.println("With added person");



    }

}
