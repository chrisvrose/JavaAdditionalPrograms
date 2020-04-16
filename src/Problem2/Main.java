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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gear, speed, startHeight;
        String color;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of gears in Mountain bike 1");
        gear = input.nextInt();
        System.out.println("Enter current speed of Mountain bike 1");
        speed = input.nextInt();
        System.out.println("Enter start height of Mountain bike 1");
        startHeight = input.nextInt();
        System.out.println("Enter color of Mountain bike 1");
        color = input.next();
        MountainBike mb1 = new MountainBike(startHeight, gear, speed, color);

        System.out.println("Enter number of gears in Mountain bike 2");
        gear = input.nextInt();
        System.out.println("Enter current speed of Mountain bike 2");
        speed = input.nextInt();
        System.out.println("Enter start height of Mountain bike 2");
        startHeight = input.nextInt();
        System.out.println("Enter color of Mountain bike 2");
        color = input.next();
        MountainBike mb2 = new MountainBike(startHeight, gear, speed, color);

        if( (mb1.getColor().equals(mb2.getColor())) && (mb1.getGear()==mb2.getGear()))
        {
            mb1.printDetails();
        }
    }
}
