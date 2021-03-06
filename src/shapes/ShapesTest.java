package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//Create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//        Rectangle box1 = new Rectangle(5,4);

//Verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//        System.out.println("Box1 Perimeter: " + box1.getPerimeter());
//        System.out.println("Box1 Area: " + box1.getArea());

//Create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//        Rectangle box2 = new Square(5);

//Verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//        System.out.println("Box2 Perimeter: " + box2.getPerimeter());
//        System.out.println("Box2 Area: " + box2.getArea());

        Measurable myShapeRec = new Rectangle(4,5);
        System.out.println(myShapeRec.getArea());
        System.out.println(myShapeRec.getPerimeter());

        Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());




    }
}
