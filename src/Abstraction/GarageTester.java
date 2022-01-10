package Abstraction;

public class GarageTester {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        bike.go();
        System.out.println(bike.wheels);
        System.out.println(bike.isCorporeal);

        Car car = new Car();
        car.go();
        System.out.println(car.wheels);

        PogoStick pogo = new PogoStick();
        pogo.go();
    }
}
