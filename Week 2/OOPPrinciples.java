abstract class Vehicle {
    private String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    abstract void start();
}

class Car extends Vehicle {
    private int speed;

    Car(String brand, int speed) {
        super(brand);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }

    @Override
    void start() {
        System.out.println(getBrand() + " car starts with a key.");
    }
}

class ElectricCar extends Car {
    ElectricCar(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void start() {
        System.out.println(getBrand() + " electric car starts silently.");
    }
}

public class OOPPrinciples {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Toyota", 100);
        Vehicle v2 = new ElectricCar("Tesla", 150);

        v1.start();
        v2.start();

        Car car = new Car("Honda", 80);
        car.setSpeed(120);
        System.out.println("Speed: " + car.getSpeed());
    }
}
