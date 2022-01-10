package shapes;

//Create a class named Square, also inside of shapes, that extends Rectangle.
public class Square extends Quadrilateral {

//Create a class named Square, also inside of shapes, that extends Rectangle. Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.

        public Square (double side){
            super(side, side); // It will look at public Rectangle if SUPER is used.
        }

    @Override
    public double getPerimeter() {
        return  (2 * length) + (length * 2);
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
