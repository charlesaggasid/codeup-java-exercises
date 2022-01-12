package grades;
import java.util.ArrayList;

//Create a class named Student.
// It should have private properties for the student's name, and grades.
// The grades property should be an ArrayList of integers.
public class Student {
    private String name;
    private ArrayList<Integer> grades;

//The student class should have a constructor that sets name property,
//and initializes the grades property as an empty ArrayList.
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

//    The Student class should have the following methods:

    // returns the student's name
    public String getName() {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for(Integer grade: this.grades){
            sum += grade;
        }
        return sum / this.grades.size();
    }

    void nextLine(){
        System.out.println();
    }

//    Test your Student class by adding a main method and creating Student objects.
//    Verify that you can add grades to each object, and that your getGradeAverage method correctly
//    returns the average of the student's grades.
    public static void main(String[] args) {
        Student charles = new Student("Charles");
        charles.addGrade(90);
        charles.addGrade(89);
        charles.addGrade(85);
        System.out.println(charles.getGradeAverage());
        System.out.println(charles.grades);
    }

}
