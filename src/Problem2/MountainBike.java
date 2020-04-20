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

public class MountainBike extends Bicycle {
    int height;

    MountainBike(int startHeight, int gear, int speed, String color) {
        super(gear, speed, color);
        this.height = startHeight;
    }

    public void setHeight(int newValue) {
        this.height = newValue;
    }

    // @Override
    public boolean equals(MountainBike a) {
        return this.color.equals(a.color)&&(this.gear==a.gear);
    }
}