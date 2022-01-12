package grades;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import util.Input;

public class GradesApplication {

//Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 Student objects with at least 3 grades each, and add them to the map.
//Be creative! Make up GitHub usernames and grades for your student objects.

    public static void main(String[] args) {

        Input input = new Input();
//        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();

        Student Tobey = new Student("Tobey");
        Tobey.addGrade(80);
        Tobey.addGrade(85);
        Tobey.addGrade(80);

        Student Chris = new Student("Chris");
        Chris.addGrade(90);
        Chris.addGrade(97);
        Chris.addGrade(99);

        Student Tony = new Student("Tony");
        Tony.addGrade(88);
        Tony.addGrade(99);
        Tony.addGrade(86);

        Student Natasha = new Student("Natasha");
        Natasha.addGrade(96);
        Natasha.addGrade(99);
        Natasha.addGrade(100);

        students.put("spidey", Tobey);
        students.put("thory", Chris);
        students.put("irony", Tony);
        students.put("blackWidowy", Natasha);

        System.out.println("\t\t\t\tWelcome!");
        System.out.println("Here are the GitHub usernames of our students:");

        for (String key : students.keySet()) {
            System.out.print("  |" + key + "|");
        }

        do {
            System.out.println("\n\n\t\t********************************");
            System.out.println("What student would you like to see more information on?");
            String userName = input.getString();
            if(students.containsKey(userName)) {
                Student currentStudent = students.get(userName);
                double avgGrade = currentStudent.getGradeAverage();
                System.out.println("**Response...");
                System.out.println("Name: " + currentStudent.getName() + "Github Username: " + userName);
                System.out.printf("Current Average: %.2f\n", avgGrade);
            } else {
                System.out.println("Sorry, there's no student with the Github username: " + userName);
            }
            System.out.println("\n**Follow-up response...");
            System.out.println("Would you like to see another student?(y=yes n=no)");
        } while(input.yesNo());
        System.out.println("Goodbye, and have a wonderful day!");

       }
}
