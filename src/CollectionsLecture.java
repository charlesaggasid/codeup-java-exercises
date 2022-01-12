import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class CollectionsLecture {
    public static void main(String[] args) {
        //Instantiate an ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        petNames[0] = "Kali"

        ArrayList<String> petNames = new ArrayList<String>();
//.add() - adds an element to the ArrayList.
//Overloaded Method = .add(index, item).
        petNames.add("Kali");
        petNames.add("Nikolai");
        petNames.add("Chorizo");
        petNames.add(0,"Bevo"); //index will specify what you want the array be.
        System.out.println(petNames); //[Bevo, Kali, Nikolai, Chorizo]
//.size()
        System.out.println(petNames.size()); //.size() find the number or elements //4

//.get(index) - return the element the specified index.
        System.out.println(petNames.get(3)); //Chorizo

// .indexOf(elementValue) - returns the index of the first occurrence of the element specified.
// returns -1 when the element does not exist in the array.
        System.out.println(petNames.indexOf("Bella")); // -1

//Iterate ArrayList
        for(String name: petNames){
            System.out.println((name)); //prints Bevo Kali Nikolai Chorizo
        }

//.contains(element) - return a boolean of whether or not the ArrayList contains an element.
        System.out.println(petNames.contains("Bevo")); //true

//.lastIndexOf(element) -
        petNames.lastIndexOf("Bevo");
        System.out.println(petNames.lastIndexOf("Bevo")); // 0

//.isEmpty() - returns a boolean whether or not the ArrayList has elements.
        System.out.println(petNames.isEmpty()); //false

//.remove(element) - NO RETURN - removes the first occurrence of the element specified.
        petNames.remove("Bevo");
        System.out.println(petNames); //[Kali, Nikolai, Chorizo]

        petNames.add(0,"Bevo");
        System.out.println(petNames); //[Bevo, Kali, Nikolai, Chorizo]


/**
 * What is an ArrayList?
 *
 * How do you instantiate an ArrayList?
 *
 * Give me methods in manipulating ArrayList.
 *
 *
 * What is a hash map?
 */

//========================================HASH MAPS=====================================================================

//A hash map is a data structure for key-value pairs, implemented with the HashMap class in Java.

        HashMap<String, Person> people = new HashMap<>();

        Person p1 = new Person("Jay");
        Person p2 = new Person("David");
        Person p3 = new Person("Ray");
        Person p4 = new Person("Trevor");

//.put(key, value) - establishes the key and value.
        people.put(p1.getName(), p1);
        people.put(p2.getName(), p2);
        people.put(p3.getName(), p3);
        people.put(p4.getName(), p4);

        System.out.println(people);
//.putIfAbsent(key, value) - only sets a key-pair value if it does not exist.
        people.putIfAbsent("Jay", new Person("Jay")); // {Jay=Person@5aef1dbe, David=Person@fa8dfa96, Ray=Person@ab00e808, Trevor=Person@855c9348}
        System.out.println(people);

//.get(key)- return the value for the specified key.
        System.out.println(people.get("Bianca")); //.sayHello() connect a method //null

//.getOrDefault() - like get, but with a defined value instead of null.
        System.out.println(people.getOrDefault("Adam", p1)); //returns Person@175ab5ee

//.containsKey(key) - returns a boolean whether or not the Key exists in the Map
        System.out.println(people.containsKey("Bevo")); //false

//.containsValue(value) - returns a boolean whether or not the Value exists in the Map.
        System.out.println(people.containsValue(p1)); //true

//.remove(key) - remove a key-value pair
        people.remove("Trevor");
        System.out.println(people); //{Jay=Person@5aef1dbe, David=Person@fa8dfa96, Ray=Person@ab00e808}

//.replace(key, value) - replace a value at a given key
// NEW YEAR, NEW ME
        people.replace("Jay", new Person("Jay"));
        System.out.println(people); //{Jay=Person@d1d6dbbb, David=Person@fa8dfa96, Ray=Person@ab00e808}

//.clear() - NO RETURN - empties the array
        people.clear();

//.isEmpty() - return boolean on whether elements exist in the array or not.
        System.out.println(people.isEmpty()); //true

    }
}
