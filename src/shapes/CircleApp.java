package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
//        Input input = new Input();
//        double radius = input.getDouble("Enter the radius of your circle: ");
//        Circle circle = new Circle(radius);
//        double area = circle.getArea();
//        double circumference = circle.getCircumference();
//        System.out.printf("The area of your circle is %.2f and its circumference is %.2f%n", area, circumference);
        Circle c1 = new Circle(4);
        System.out.println(c1.getArea());

        System.out.println(c1.getCircumference());
    }


}
