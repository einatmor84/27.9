import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Circle c1 = new Circle(5.4);
        Circle c2 = new Circle(8.7);

        c1.printSize();
        c2.printSize();

        Car car = new Car();
        car.run();
    }
}

public class Car {
    String brand;
    public Car(){
        this.brand = "Ford";
    }
    public String getBrand(){
        return  brand;
    }
    public void run(){
        System.out.println("Car " + getBrand() + " is running...");
    }
}


public class Circle {
    double radius;
    public  Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }
    public void printSize(){
        System.out.println( "circle size: " + Math.PI* Math.pow(radius, 2));
    }
}
