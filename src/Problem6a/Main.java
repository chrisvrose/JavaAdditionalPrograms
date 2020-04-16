/*
(a) On a single track two vehicles are running. As vehicles are going in same direction
there is no problem. If the vehicles are running in different direction there is a
chance of collision. To avoid collisions write a Java program using exception
handling. You are free to make necessary assumptions.
 */
package Problem6a;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int speed;
        String dir;

        System.out.println("What speed is the first vehicle moving in?");
        speed = input.nextInt();
        System.out.println("What direction is the first vehicle moving in? (up, down, left or right)");
        dir = input.next();
        Vehicle vehicle1 = new Vehicle(speed, dir);

        System.out.println("What speed is the second vehicle moving in?");
        speed = input.nextInt();
        System.out.println("What direction is the second vehicle moving in? (up, down, left or right)");
        dir = input.next();
        Vehicle vehicle2 = new Vehicle(speed, dir);

        try{
            if(vehicle1.getDirection().equalsIgnoreCase(vehicle2.getDirection())) {
                System.out.println("Perfectly safe roads");
            }
            else{
                throw new VehicleCollisionException();
            }
        }
        catch(VehicleCollisionException vce) {
            vce.printStackTrace();
        }
    }
}
