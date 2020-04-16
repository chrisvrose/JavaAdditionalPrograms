/*
(a) On a single track two vehicles are running. As vehicles are going in same direction
there is no problem. If the vehicles are running in different direction there is a
chance of collision. To avoid collisions write a Java program using exception
handling. You are free to make necessary assumptions.
 */
package Problem6a;

public class Vehicle {
    int speed;
    String direction;

    Vehicle(int speed, String dir) {
        this.speed = speed;
        this.direction = dir;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getDirection() {
        return this.direction;
    }
}
