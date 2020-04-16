/*
Write a Java program to create a base class called Bicycle with member variables (gear
        speed, color) of type integer and string, methods (applyBrake(int decrement),
        speedUp(int increment)) and constructors Bicycle(int gear, int speed, int color). Derive
        subclass called MountainBike from the superclass Bicycle with member variable
        (height) of type integer, public methods (setHeight(int newValue)) and its
        constructors(MountainBike(int gear,int speed,String color, int startHeight)). Create the
        two instances of MountainBikes and print similar Mountain bikes if the color and
        number of gears of mountain bikes are same. Demonstrate the code reuse and
        Inheritance properties of Object oriented programming by inheriting the constructors
        and methods of the base class.
*/
package Problem2;

public class Bicycle {
    int gear;
    int speed;
    String color;

    Bicycle(int gear, int speed, String color) {
        this.gear = gear;
        this.speed = speed;
        this.color = color;
    }

    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }
    public void sppedUp(int increment) {
        this.speed += increment;
    }
    public String getColor() {
        return this.color;
    }
    public int getGear () {
        return this.gear;
    }
    public void printDetails () {
        System.out.println("Number of gears: "+this.gear);
        System.out.println("Speed of bicycle: "+this.speed);
        System.out.println("Color of bicycle: "+this.color);
    }
}
