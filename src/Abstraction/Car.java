package Abstraction;

public class Car extends Vehicle{
    public byte wheels = 2;

    @Override
    public void go() {
        System.out.println("Car method Vroom vroom");
    }
}
