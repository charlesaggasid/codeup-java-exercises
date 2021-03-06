package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

// It should have protected properties for both length and width.
//    protected double length;
//    protected double width;

//Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }

// Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
//perimeter = 2 x length + 2 x width
//area = length x width
//    public double getArea(){
//        return this.length * this.width;
//    }
//    public double getPerimeter(){
//        return (2 * this.length) + (2 * this.width);
//    }
public Rectangle(double length, double width) {
    super(length, width);
}

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

}